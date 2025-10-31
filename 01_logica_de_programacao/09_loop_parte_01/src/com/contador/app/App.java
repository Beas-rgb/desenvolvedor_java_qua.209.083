package com.contador.app;

import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);


        System.out.println("Informe um número inteiro:");
        int numero = ler.nextInt();

        // loop (Laço de repetição)
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
            
        }

        ler.close();
    }
}
