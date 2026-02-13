package com.login.app.controller;

import com.login.app.model.Usuario;
import com.login.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro";
    }
    
    @PostMapping("/salvarUsuario")
    public String salvarUsuario(Usuario usuario) {
        // Verifica se login já existe
        if (usuarioRepository.existsByLogin(usuario.getLogin())) {
            return "redirect:/cadastro?error=exists";
        }
        
        // Criptografa a senha
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);
        return "redirect:/login?success";
    }
    
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "home";
    }
}