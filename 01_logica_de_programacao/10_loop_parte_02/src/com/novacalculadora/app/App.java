package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        double x; 
        double y; 
        double resultado = 0.0;
        String operacao;

        // loop
        do {
            // menu
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto da Divisão");
            System.out.println("6 - potenciação");
            System.out.println("7 - Sair do programa");
            operacao = leia.nextLine();

            if (!operacao.equals("7")) {
                // entrada de dados 
                System.out.println("Informe o valor de x: ");
                x = leia.nextDouble();

                System.out.println("Informe o valor de y: ");
                y = leia.nextDouble();

                // limpar o buffer 
                leia.nextLine();

                switch (operacao) {
                    case "1":
                        resultado = x + y;
                        break;
                    case "2":
                        resultado = x - y;
                        break;
                    case "3":
                        resultado = x * y;
                        break;
                    case "4":
                        resultado = x / y;
                        break;
                    case "5":
                        resultado = x % y;
                        break;
                    case "6":
                        resultado = Math.pow(x, y);
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                // Mostrar o resultado
                System.out.println("O resultado da operação é: " + resultado);
            } 

        } while(!operacao.equals("7"));
        
        System.out.println("Programa encerrado.");

        leia.close();
    }
}
