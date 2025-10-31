package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        double x; 
        double y; 
        double resultado;
        int opcao = 0;
        String operacao;

        // FIXME: loop
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

            if (operacao != "7" ) {
                // entrada de dados 
                System.out.println("Informe o valor de x: ");
                x = leia.nextDouble();

                System.out.println("Informe o valor de y: ");
                y = leia.nextDouble();

                switch (operacao) {
                    case "1":
                        resultado = x + y;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "2":
                        resultado = x - y;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "3":
                        resultado = x * y;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "4":
                        resultado = x / y;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "5":
                        resultado = x % y;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "6":
                        resultado = Math.pow(x, y);
                        System.out.println("Resultado: " + resultado);
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } 
            else {
                System.out.println("Saindo do programa...");

                break;
            }

            // limpar buffer
            leia.nextLine();

        } while(opcao != 7);

        leia.close();
    }
}
