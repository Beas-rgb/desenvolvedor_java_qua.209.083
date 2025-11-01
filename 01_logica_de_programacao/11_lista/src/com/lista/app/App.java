package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancias
        Scanner leia = new Scanner(System.in); // Scanner
        String[] nomes = new String[10]; // array

        
        // entrada de dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º nome: ");
            nomes[i] = leia.nextLine();

        }

        // saídas de dados
        System.out.println("\n--Nomes informados--");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }


        leia.close();
    }
}
