package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // entrada de dados
        System.out.print("Informe o seu nome: ");
        usuario.nome = leia.nextLine();

        System.out.print("Informe o seu CPF: ");
        usuario.cpf = leia.nextLine();

        System.out.print("Informe o seu email: ");
        usuario.email = leia.nextLine();

        System.out.print("Informe o sua idade: ");
        usuario.idade = leia.nextInt();

        System.out.print("Informe o sua altura em metros: ");
        usuario.altura = leia.nextDouble();


        // saída de dados
        usuario.exibirDados();

        leia.close();
    }
}
