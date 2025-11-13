package com.indice.app;

import javax.swing.JOptionPane;

import com.indice.models.Processo;
public class App {
    public static void main(String[] args) throws Exception {
        Processo p = new Processo();

        // array
        String[] opcoes = {"Inserir valores para o imc", "Calculer o tempod de vida com imc" , "Sair do programa"};
        Object opcao;


        do {
            // entrada de dados
            opcao = JOptionPane.showInputDialog(null, "Selecione uma opção", "Imc", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            if (opcoes[0].equals(opcao)) {
                // entrada de dados para peso e altura
                p.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
                p.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ").replace("," , ".")));
                p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ").replace("," , ".")));
                

                double imc = p.calcularIMC();
                String classificacao = p.classificarIMC();

                String imcFormatado = String.format("%.2f", imc);

                
                JOptionPane.showMessageDialog(null, p.getNome()  + " o seu imc e: " + imcFormatado + "\nClassificação: " + classificacao + "\nDica: " + p.dica());
            }
            else{
                break;
            }






        } while (opcao != "Sair do programa");


    }

}
