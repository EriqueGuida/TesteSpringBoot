package br.com.senai.teste.dto;

import br.com.senai.teste.model.Usuario;
import lombok.Getter;

@Getter 
public class UsuarioResponse {
    
    private Integer id;
    private String login;

    public UsuarioResponse(Usuario usuario){
        this.id = usuario.getId();
        this.login = usuario.getLogin();
    }
}
