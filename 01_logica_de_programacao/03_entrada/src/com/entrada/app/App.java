package com.entrada.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância (cria um novo objeto) do objeto ler 
        Scanner ler = new Scanner(System.in);
        // Entrada de dados
        System.out.println("Digite o seu nome: ");
        String name = ler.nextLine();

        System.out.println("Qual a sua idade: ");
        int idade = ler.nextInt();
            if (idade < 18) {
                System.out.println("Você é menor de idade.");
            } else {
                System.out.println("Você é maior de idade.");
            }

        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();

        // Limpeza de buffer
        ler.nextLine();

        System.out.println("Qual o seu e-mail: ");
        //String email = ler.next();
        String email = ler.nextLine();

        System.out.println("Sua cor é azul? (true/false): ");
        boolean isAzul = ler.nextBoolean();


        // Saída de dados
        System.out.println("Olá, " + name + "!" + " Você tem " + idade + " anos de idade" + " e sua alrura é " + altura + "m." + " É " + isAzul + " que sua cor é azul." + " Seu e-mail é: " + email + " tudo fucionando corretamente!");

        System.out.println(idade);

        ler.close();
    }
}
