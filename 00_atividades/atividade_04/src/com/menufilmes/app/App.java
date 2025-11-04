package com.menufilmes.app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        String nome;
        int idade;
        String sala;
        boolean idadeValida = false; // controla se pode encerrar

        int poltrona = random.nextInt(50) + 1;
        int numero = random.nextInt(1000);


        // repete tudo enquanto a idade não for válida
        while (!idadeValida) {

            System.out.print("\nDigite seu nome: ");
            nome = leia.nextLine();

            System.out.print("Digite sua idade: ");
            idade = leia.nextInt();
            leia.nextLine(); // limpa o buffer do teclado

            System.out.println("\nOlá, seja bem-vindo ao Menu Filmes!");

            System.out.println("\nEscolha a sala que deseja assistir o filme:");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");

            System.out.print("\nDigite o número da sala: ");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                    System.out.println("\nSala 1 - A Roda Quadrada - Livre.");
                    System.out.println("Cupom nº " + numero + " | Poltrona " + poltrona);
                    System.out.println("Aproveite o filme, " + nome + "!");
                    idadeValida = true;
                    break;

                case "2":
                    if (idade >= 12) {
                        System.out.println("\nSala 2 - A Volta dos Que Não Foram - 12 anos.");
                        System.out.println("Cupom nº " + numero + " | Poltrona " + poltrona);
                        System.out.println("Aproveite o filme, " + nome + "!");
                        idadeValida = true;
                    } else {
                        System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente (mínimo 12 anos).");
                        System.out.println("Vamos tentar novamente!");
                    }
                    break;

                case "3":
                    if (idade >= 14) {
                        System.out.println("\nSala 3 - Poeira em Alto Mar - 14 anos.");
                        System.out.println("Cupom nº " + numero + " | Poltrona " + poltrona);
                        System.out.println("Aproveite o filme, " + nome + "!");
                        idadeValida = true;
                    } else {
                        System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente (mínimo 14 anos).");
                        System.out.println("Vamos tentar novamente!");
                    }
                    break;

                case "4":
                    if (idade >= 16) {
                        System.out.println("\nSala 4 - As Tranças do Rei Careca - 16 anos.");
                        System.out.println("Cupom nº " + numero + " | Poltrona " + poltrona);
                        System.out.println("Aproveite o filme, " + nome + "!");
                        idadeValida = true;
                    } else {
                        System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente (mínimo 16 anos).");
                        System.out.println("Vamos tentar novamente!");
                    }
                    break;

                case "5":
                    if (idade >= 18) {
                        System.out.println("\nSala 5 - A Vingança do Peixe Frito - 18 anos.");
                        System.out.println("Cupom nº " + numero + " | Poltrona " + poltrona);
                        System.out.println("Aproveite o filme, " + nome + "!");
                        idadeValida = true;
                    } else {
                        System.out.println("\nDesculpe, " + nome + ". Você não tem idade suficiente (mínimo 18 anos).");
                        System.out.println("Vamos tentar novamente!");
                    }
                    break;

                default:
                    System.out.println("\nSala inválida. Escolha uma sala entre 1 e 5.");
                    System.out.println("Vamos tentar novamente!");
                    break;
            }
        }

        leia.close();
    }
}
