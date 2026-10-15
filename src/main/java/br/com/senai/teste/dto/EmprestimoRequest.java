package br.com.senai.teste.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmprestimoRequest {
    
    @NotNull (message = "O ID do aluno é obrigatório")
    private Integer alunoId;

    @NotNull (message = "O ID do livro é obrigatório")
    private Integer livroId;

    @NotNull (message = "A data prevista de devolução é obrigatória")
    @Future (message = "A data prevista deve ser no futuro")
    private LocalDate dataPrevistaDevolucao;
}
