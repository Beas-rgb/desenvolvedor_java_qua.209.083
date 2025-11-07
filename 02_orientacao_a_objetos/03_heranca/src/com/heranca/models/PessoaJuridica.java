package com.heranca.models;

// classe filha
public class PessoaJuridica extends Pessoa {
    // atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirDados() {
        System.out.println("Razao social: " + this.razaoSocial);
        System.out.println("Nome fantasia: " + this.nomeFantasia);
        System.out.println("Cnpj: " + this.cnpj);
        super.exibirDados();
    }

}
