package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        Pessoa usuario = new Pessoa("", "", "", "", 0);

        // entrada de dados
        System.out.println("Digite seu nome: ");
        usuario.nome = leia.nextLine();

        System.out.println("Digite seu cpf: ");
        usuario.cpf = leia.nextLine();

        System.out.println("Digite seu email: ");
        usuario.email = leia.nextLine();

        System.out.println("Digite seu telefone: ");
        usuario.telefone = leia.nextLine();

        System.out.println("Digite sua idade: ");
        usuario.idade = leia.nextInt();

        // saida de dados
        System.out.println(usuario.apresentar());
        


        leia.close();

    }
}
