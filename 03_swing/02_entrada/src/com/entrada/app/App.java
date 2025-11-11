package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variavel
        String name;
        String resultado;
        int idade;


        // entrada de dados
        name = JOptionPane.showInputDialog("Informe o seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Infome a sua idade: "));

        

        // verifica maioridade
        resultado = (idade >= 18) ? "é maior de idade" : "é menor de idade";
        JOptionPane.showMessageDialog(null, "Ola " + name + ", vocé tem " + idade + " anos, portanto, você " + resultado);


    }
}
