package com.equacao1grau.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leia.nextDouble();

        System.out.print("Digite o valor de b: "); 
        double b = leia.nextDouble();

        if (a != 0 ){
            double x = -b / a;
            System.out.println("O valor de x é: " + x);
        }
        else {
            System.out.println("Não exite raíz real.");
        }


        leia.close();
    }
}
