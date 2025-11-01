package com.menufilmes.app;

import java.util.Scanner;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        String nome;
        int idade;
        String sala;


        int poltrona = random.nextInt(50) + 1;

        int numero = random.nextInt(1000);



        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("\nOlá, seja bem-vindo ao Menu Filmes!");
        System.out.println("Sala 1 - A Roda Quadrada - Livre");
        System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
        System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
        System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
        System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");

        System.out.println("\nEscolha a sala que deseja assistir o filme: ");
        sala = leia.next();


        switch (sala) {
            case "1":
                System.out.println("\nSala 1 - A Roda Quadrada - Livre. A Volta dos Que Não Foram - 12 anos. O número do seu cupom é " + numero + " e sua poltrona é a de número " + poltrona + ". Aproveite o filme, " + nome + "!");
                break;
            case "2":
                if (idade >= 12) {
                    System.out.println("\nSala 2 - A Volta dos Que Não Foram - 12 anos. O número do seu cupom é " + numero + " e sua poltrona é a de número " + poltrona + ". Aproveite o filme, " + nome + "!");
                } else {
                    System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente para assistir a este filme. A idade minima é 12 anos.");
                }
                break;
            case "3":
                if (idade >= 14) {
                    System.out.println("\nSala 3 - Poeira em Alto Mar - 14 anos. O número do seu cupom é " + numero + " e sua poltrona é a de número " + poltrona + ". Aproveite o filme, " + nome + "!");
                } else {
                    System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente para assistir a este filme. A idade minima é 14 anos.");
                }
                break;
            case "4":
                if (idade >= 16) {
                    System.out.println("\nSala 4 - As Tranças do Rei Careca - 16 anos. O número do seu cupom é " + numero + " e sua poltrona é a de número " + poltrona + ". Aproveite o filme, " + nome + "!");
                } else {
                    System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente para assistir a este filme. A idade minima é 16 anos.");
                }
                break;
            case "5":
                if (idade >= 18) {
                    System.out.println("\nSala 5 - A Vingança do Peixe Frito - 18 anos. O número do seu cupom é " + numero + " e sua poltrona é a de número " + poltrona + ". Aproveite o filme, " + nome + "!");
                } else {
                    System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente para assistir a este filme. A idade minima é 18 anos.");
                }
                break;

            default:
                System.out.println("\nSala inválida. Por favor, escolha uma sala entre 1 e 5.");
                break;
        }




        leia.close();
    }
}
