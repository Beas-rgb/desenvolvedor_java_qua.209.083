package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o seu CPF: "));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o seu email: "));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o seu telefone: "));

        // saida de dados
        JOptionPane.showMessageDialog(null, "--------Dados do usuário--------\n Nome: " + usuario.getNome() + "\n Idade: " + usuario.getIdade() + "\n CPF: " + usuario.getCpf() + "\n Email: " + usuario.getEmail() + "\n Telefone: " + usuario.getTelefone());


    }
}
