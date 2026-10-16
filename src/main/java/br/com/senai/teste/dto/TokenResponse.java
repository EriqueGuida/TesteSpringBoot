package br.com.senai.teste.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter 
public class TokenResponse {
    
    private String token;

    public TokenResponse(String token){
        this.token = token;
    }
}
