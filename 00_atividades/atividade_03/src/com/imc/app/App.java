package com.imc.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o peso em kg:");
        double peso = ler.nextDouble();

        System.out.println("Digite a altura em metros:");
        double altura = ler.nextDouble();


        double imc = peso / (altura * altura);

        System.out.printf("\n59Seu IMC é: %.2f%n", imc);
        if (imc < 18.5){
            System.out.printf("%-20s %-25s %-20s%n", "Menor que 18,5", "Abaixo do peso (Magreza)", "Baixo");
        }
        else if (imc >= 18.5 && imc < 25){
            System.out.printf("%-20s %-25s %-20s%n", "18,5 a 25,0", "Normal", "Médio");
        }
        else if (imc >= 25 && imc < 30){
             System.out.printf("%-20s %-25s %-20s%n", "25,0 a 30,0", "Sobrepeso", "Levemente aumentado");
        }
        else if (imc >= 30 && imc < 35){
            System.out.printf("%-20s %-25s %-20s%n", "30,0 a 35,0", "Obesidade Grau I", "Moderado");
        }
        else if (imc >= 35 && imc < 40){
            System.out.printf("%-20s %-25s %-20s%n", "35,0 a 40,0", "Obesidade Grau II", "Alto");
        }
        else {
            System.out.printf("%-20s %-25s %-20s%n", "40,0 ou mais", "Obesidade Grau III (Mórbida)", "Muito alto");
        }


        ler.close();
    }
}
