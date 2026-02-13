package com.login.app.repository;

import com.login.app.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
    // Buscar usuário por login
    Usuario findByLogin(String login);
    
    // Verificar se login existe
    boolean existsByLogin(String login);
    
    // Deletar por login
    void deleteByLogin(String login);
}