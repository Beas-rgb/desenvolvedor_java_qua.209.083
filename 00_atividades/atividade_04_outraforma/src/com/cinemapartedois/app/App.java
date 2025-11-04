package com.cinemapartedois.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String[] salas = new String[5];
        String nome;
        String sala;
        int idadeMinima = 0;
        int idade;


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

            // TODO : termina o programa
        } while (idade < idadeMinima);

        leia.close();

    }
}
