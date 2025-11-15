package com.inteface.app;

import javax.swing.JOptionPane;

import com.inteface.models.Conta;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(null, null, "1234-5", "12345-6", 0.0);

        Random random = new Random();

        int agencia = random.nextInt(9999);
        int agencia1 = random.nextInt(9);
        int nConta = random.nextInt(9999);
        int nConta2 = random.nextInt(9);

        conta.setAgencia(String.valueOf(agencia) + "-" + String.valueOf(agencia1));
        conta.setNConta(String.valueOf(nConta) + "-" + String.valueOf(nConta2));

        String[] opcoes = {
            "Consultar dados", 
            "Depositar", 
            "Sacar", 
            "Sair"
        };
        Object opcao;

        double valor;

        conta.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        conta.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta:"));

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha opção desejada", 
                null, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );
            if (opcao == "Consultar dados") {
                JOptionPane.showMessageDialog(null, conta.consultarDados());
            }
            else if (opcao == "Depositar") {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do depósiro em R$: ").replace(",", "."));
                JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso. \nSaldo atual: R$ " + String.format("%.2f", conta.depositar(valor)));
            }
            else if (opcao == "Sacar") {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do saque em R$: ").replace(",", "."));
                if (conta.getSaldo() >= valor){
                    JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso. \nSaldo atual: R$ " + String.format("%.2f", conta.sacar(valor)));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente!" + "\nFalta R$ " + String.format("%.2f", conta.falta(valor)) + " para o saque.");
                } 
            }
            else if (opcao == "Sair") {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while(opcao != "Sair");

    }
}