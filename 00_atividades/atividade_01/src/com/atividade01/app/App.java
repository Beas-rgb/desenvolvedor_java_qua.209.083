package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.print("Infomer o seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Inform a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = leia.nextLine();

        System.out.println("Informe o seu cpf: ");
        String cpf = leia.nextLine();

        System.out.println("Informe o seu e-mail: ");
        String email = leia.nextLine();

        System.out.println("Informe o seu telefone: ");
        String telefone = leia.nextLine();

        System.out.println("\n--- Dados Informados ---");
        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email); 
        System.out.println("Telefone: " + telefone);
 

        leia.close();
    }
}
