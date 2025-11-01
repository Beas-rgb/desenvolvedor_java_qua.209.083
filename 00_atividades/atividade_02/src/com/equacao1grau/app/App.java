package com.equacao1grau.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leia.nextDouble();

        System.out.print("Digite o valor de b: "); 
        double b = leia.nextDouble();

        double x = -b / a;
        System.out.println("O resultado de x é: " + x);

        leia.close();
    }
}
