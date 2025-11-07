package com.heranca.models;

public class Pessoa {
    // atributos
    public String email;
    public String telefone;

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // método
    public void exibirDados() {
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);

    }
    
}
