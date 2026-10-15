package br.com.senai.teste.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.senai.teste.model.Usuario;
import br.com.senai.teste.repository.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService{
    
    public final UsuarioRepository usuarioRepository;

    public AutenticacaoService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;   
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException{

        Optional<Usuario> usuarioEncotrado = usuarioRepository.findByLogin(login);

        if (usuarioEncotrado.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        Usuario usuario = usuarioEncotrado.get();

        return User.withUsername(usuario.getLogin()).password(usuario.getSenha()).roles("USER").build();
    }
}
