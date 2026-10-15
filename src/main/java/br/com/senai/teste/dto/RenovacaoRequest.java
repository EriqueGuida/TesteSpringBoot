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
public class RenovacaoRequest {
    
    @NotNull (message = "A nova data é obrigatória")
    @Future (message = "A nova data deve ser no futuro")
    private LocalDate novaDataPrevista;
}
