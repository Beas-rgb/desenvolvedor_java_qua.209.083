package com.cinemapartedois.app;

import java.util.Scanner;


import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        String[] salas = new String[5];
        String nome;
        String sala;
        String filme = "";
        int idadeMinima = 0;
        int idade;

        int numero = random.nextInt(1000);
        int poltrona = random.nextInt(50) + 1;


        // inicializar o array 
        salas[0] = "A Roda Quadrada";
        salas[1] = "A Volta dos Que Não Foram";
        salas[2] = "Poeira em Alto Mar";
        salas[3] = "As Tranças do Rei Careca";
        salas[4] = "A Vingança do Peixe Frito";

        // entrada de dados
        System.out.print("Informe o nome: ");
        nome = leia.nextLine();

        System.out.print("Informe a idade: ");
        idade = leia.nextInt();
        

        // limpar o buffer
        leia.nextLine();

        //loop
        do {
            // menu
            System.out.println("Sala 1 - " + salas[0] + "  - Livre");
            System.out.println("Sala 2 - " + salas[1] + "  - 12 anos");
            System.out.println("Sala 3 - " + salas[2] + "  - 14 anos");
            System.out.println("Sala 4 - " + salas[3] + "  - 16 anos");
            System.out.println("Sala 5 - " + salas[4] + "  - 18 anos");
            System.out.print("Escolha a sala desejada (1-5): ");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                    filme = salas[0];
                    idadeMinima = 0;
                    break;
                case "2":
                    filme = salas[1];
                    idadeMinima = 12;
                    break;
                case "3":
                    filme = salas[2];
                    idadeMinima = 14;
                    break;
                case "4":
                    filme = salas[3];
                    idadeMinima = 16;
                    break;
                case "5":
                    filme = salas[4];
                    idadeMinima = 18;
                    break;

                default:
                    System.out.println("Sala inválida! Tente novamente.");
                    continue;
            }

            if (idade >= idadeMinima) {
                System.out.println("Acesso permitido!"+ nome + ", Aproveite o filme: " + filme + "." + " Cupom nº " + numero + " | Poltrona " + poltrona);
                System.out.println("🥳");
            } 
            else {
                System.out.println("Acesso negado! Você não tem idade suficiente para assistir: " + filme + ". Idade mínima: " + idadeMinima + " anos.");
                System.out.println("😞");
            }
        } while (idade < idadeMinima);

        leia.close();

    }
}
