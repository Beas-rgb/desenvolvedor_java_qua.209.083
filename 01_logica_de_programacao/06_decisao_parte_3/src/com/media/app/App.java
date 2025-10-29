package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia da classe Scanner
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leia.nextLine();
        
        System.out.println("Informe a primeira nota do aluno: ");
        double nota01 = leia.nextDouble();

        System.out.println("Informe a segunda nota do aluno: ");
        double nota02 = leia.nextDouble();

        System.out.println("Informe a terceira nota do aluno: ");
        double nota03 = leia.nextDouble();

        double media2 = (nota01 + nota02 + nota03) / 3;

        String mediaFormatada2 = String.format("%.1f", media2);

        if (media2 >= 7 && media2 <= 10){
            System.out.println("O " + nome + " ficou com a média " + mediaFormatada2 + " e foi aprovado!");
        } 
        else if (media2 >= 5 && media2 < 7){
            System.out.println("O " + nome + " ficou com a média " + mediaFormatada2 + " e está de recuperação!");
        }
        else if(media2 >= 0 && media2 < 5){
            System.out.println("O " + nome + " ficou com a média " + mediaFormatada2 + " e foi reprovado!");
        }
        else{
            System.out.println("Média inválida!");
        }




       /*  while(true){
            System.out.println("Digite o nome do aluno: ");
            String nome2 = leia.nextLine();

            System.out.println("Informe a primeira nota do aluno: ");
            double nota01 = leia.nextDouble();

            System.out.println("Informe a segunda nota do aluno: ");
            double nota02 = leia.nextDouble();

            System.out.println("Informe a terceira nota do aluno: ");
            double nota03 = leia.nextDouble();

            double media2 = (nota01 + nota02 + nota03) / 3;

            String mediaFormatada2 = String.format("%.1f", media2);

            if (media2 >= 7 && media2 <= 10){
                System.out.println("O " + nome2 + " ficou com a média " + mediaFormatada2 + " e foi aprovado!");
            } 
            else if (media2 >= 5 && media2 < 7){
                System.out.println("O " + nome2 + " ficou com a média " + mediaFormatada2 + " e está de recuperação!");
            }
            else if(media2 >= 0 && media2 < 5){
                System.out.println("O " + nome2 + " ficou com a média " + mediaFormatada2 + " e foi reprovado!");
            }
            else{
                System.out.println("Média inválida!");
            }

            System.out.println("Digite 'sair' para encerrar ou pressione Enter para continuar: ");
            leia.nextLine(); // Consumir a nova linha pendente
            if (leia.nextLine().equalsIgnoreCase("sair")){
                break;
            }
        }*/
        

        leia.close();
    }
}
