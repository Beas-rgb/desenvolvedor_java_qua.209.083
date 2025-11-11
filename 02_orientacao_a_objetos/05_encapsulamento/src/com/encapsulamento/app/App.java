package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando as classes
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // entrada de dados
        System.out.println("Digite o nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Digite o CPF: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Digite o email: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Digite a idade: ");
        usuario.setIdade(leia.nextInt());

        // saida de dados
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());

        leia.close();
    }
}
