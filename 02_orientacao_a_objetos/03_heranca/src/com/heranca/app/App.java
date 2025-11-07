package com.heranca.app;

// classe Java importada
import java.util.Scanner;

// inportação de classe criadas pro mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica("João", "123.456.789-00", 20, "Q8MjN@example.com", "(11) 99999-9999");
        PessoaJuridica corp = new PessoaJuridica("Corp", "123.456.789-00", "123.456.789-00", "Q8MjN@example.com", "(11) 99999-9999");

        // entrada de dados
        System.out.println("Informe os dados do usuário\n");
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o email: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = leia.nextInt();

        // limpa buffer
        leia.nextLine();

        System.out.println("Informe os dados da empresa\n");
        System.out.println("Informe a razao social: ");
        corp.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia: ");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("Informe o CNPJ: ");
        corp.cnpj = leia.nextLine();
        System.out.println("Informe o email: ");
        corp.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        corp.telefone = leia.nextLine();

        // impressao de dados
        System.out.println("\n");
        System.out.println("\nInformacoes do usuário: " + usuario.toString());
        System.out.println("\nInformacoes da empresa: " + corp.toString());
        
        // saida de dados
        System.out.println("\n--- Dados do usuário ---\n");
        usuario.exibirDados();

        System.out.println("\n--- Dados da empresa ---\n");
        corp.exibirDados();


        leia.close();
    }
}