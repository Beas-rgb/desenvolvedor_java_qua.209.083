package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis


        // entrada de dados
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Informe sua idade: ");
        int idadeUsuario = leia.nextInt();

        // estrutura de decisão
        if (idadeUsuario >= 18 && idadeUsuario < 65){
            System.out.println(nome + ", você tem " + idadeUsuario + " anos vai trabalhar.");
        } 
        else if (idadeUsuario < 18 && idadeUsuario >= 16 ){
            System.out.println(nome + ", você tem " + idadeUsuario + " anos tá quase trabalhando.");
        } 
        else if (idadeUsuario < 16 && idadeUsuario >= 0 ){
            System.out.println(nome + ", você tem " + idadeUsuario + " anos não trabalha(amém).");
        } 
        else if (idadeUsuario >= 65){
            System.out.println(nome + ", você tem " + idadeUsuario + " anos pode trabalhar menos.");
        } 
        else {
            System.out.println("Vai nascer logo, para trabalhar!");
        }

        // fecha objeto leia
        leia.close();

    }
}
