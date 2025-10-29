package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do viajante: ");
        String nome = leia.nextLine();

        System.out.println("Digite o valor total das compras: ");
        double valor = leia.nextDouble();

        String result = (valor <= 1000) ? 
            "O viajante " + nome + " está liberado." : 
            "O viajante " + nome + " está retido";

        System.out.println(result);

        leia.close();
    }
}
