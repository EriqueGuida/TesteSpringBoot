package br.com.senai.teste.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emprestimo")
@Getter
@Setter
@NoArgsConstructor 
public class Emprestimo {

    private static final BigDecimal MULTA_POR_DIA = new BigDecimal("2.00");
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataPrevistaDevolucao;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private Livro livro;

    // Método para obter a situação do empréstimo
    public String getSituacao(){

        if(dataDevolucao != null){
            return "DEVOLVIDO";
        }

        if(dataPrevistaDevolucao == null){
            return "SEM_PREVISAO";
        }

        if(dataPrevistaDevolucao.isBefore(LocalDate.now())){
            return "ATRASADO";
        }

        return "ATIVO";
    }

    // Método para calcular os dias de atraso
    public long getDiasAtraso(){
        
        if (dataDevolucao != null || dataPrevistaDevolucao == null || !dataPrevistaDevolucao.isBefore(LocalDate.now())) {
            return 0;
        }

        LocalDate dataFinal;

        if (dataDevolucao == null){
            dataFinal = LocalDate.now();
        } else {
            dataFinal = dataDevolucao;  
        }

        return ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataFinal);
    }

    // Método para calcular o valor da multa
    public BigDecimal getValorMulta(){
        
        return MULTA_POR_DIA.multiply(BigDecimal.valueOf(getDiasAtraso()));
    }
}
