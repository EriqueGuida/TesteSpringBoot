package br.com.senai.teste.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class UsuarioRequest {
    
    @NotBlank (message = "O login é obrigatório")
    private String login;

    @NotBlank (message = "A senha é obrigatória")
    @Size (min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String senha;
}
