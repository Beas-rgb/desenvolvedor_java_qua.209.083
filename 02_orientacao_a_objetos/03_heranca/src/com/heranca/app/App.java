package com.heranca.app;

// import java.util.Scanner;

// inportação de classe
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;



public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        empresa.razaoSocial = "Empresa LTDA";
        empresa.nomeFantasia = "Empresa";
        empresa.cnpj = "00.000.000/0001-00";
        empresa.email = "empresa@gmail.com";
        empresa.telefone = "(11) 99999-9999";

        usuario.nome = "Joao";
        usuario.cpf = "123.456.789-00";
        usuario.email = "joao@gmail.com";
        usuario.telefone = "(11) 99999-9999";
        usuario.idade = 20;

        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.cpf);
        System.out.println("Email: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Idade: " + usuario.idade + " anos.");

        System.out.println("\n-------------------------------\n");

        System.out.println("Razão Social: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia: " + empresa.nomeFantasia);
        System.out.println("CNPJ: " + empresa.cnpj);
        System.out.println("Email: " + empresa.email);
        System.out.println("Telefone: " + empresa.telefone);


    }
}
