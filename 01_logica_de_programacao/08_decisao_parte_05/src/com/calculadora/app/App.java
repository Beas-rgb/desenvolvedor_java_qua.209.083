package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double resultado;

        System.out.println("Digite o primeiro número: ");
        double num1 = ler.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        // limpeza do buffer
        ler.nextLine();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        String operacao = ler.nextLine();

        switch (operacao) {
            case "1":
                resultado = num1 + num2;
                System.out.println("O resultado da soma dos números " + num1 + " e " + num2 + " da " + resultado);
                break;
            case "2":
                resultado = num1 - num2;
                System.out.println("O resultado da subtração dos números " + num1 + " e " + num2 + " da "  + resultado);
                break;
            case "3":
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação dos números " + num1 + " e " + num2 + " da " + resultado);
                break;
            case "4":
                resultado = num1 / num2; 
                System.out.println("O resultado da divisão dos números " + num1 + " e " + num2 + " da " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        ler.close();
    }
}
