package com.tremfanstasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instanciaa a classe Scanners 
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a sua idade: ");
        int idade = leia.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = leia.next();

        System.out.println("Informe a sua altura em metros: ");
        double altura = leia.nextDouble();

        if (idade >= 14 && altura >= 1.5) {
            System.out.println("Você " + nome + " pode entrar no brinquedo!");
        } else if (idade < 14 ){
            System.out.println("Você tem " + idade + " anos. Vai espera sem chorar!");
        } else if (altura < 1.5) {
            System.out.println("Você tem " + altura + "m de altura. Vai puxar um banquinho!");
        } else {
            System.out.println("Você não é normal!");
        }

        // fecha objeto Scanner
        leia.close();
    }
}
