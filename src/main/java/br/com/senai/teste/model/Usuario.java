package br.com.senai.teste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table (name = "usuario")
@Getter
@Setter 
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false, unique = true)
    private String login;

    @Column (nullable = false)
    private String senha;

    // Construtor com parâmetros
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
}
