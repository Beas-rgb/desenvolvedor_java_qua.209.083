package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {

    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();


        // array
        String[] opcoes = {"Informa valores", "Sair do programa"};
        Object opcao;


        do {
            // entrada de dados
            opcao = JOptionPane.showInputDialog(null, "Selecione uma opção", "Combustivel", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao != "Sair do programa"){
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Infome o valor da gasolina: ").replace("," , ".")));
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do etanol: ").replace(",", ".")));
            }
            else {
                break;
            }
            

         
            // saida de dados
            JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
        } while (opcao != "Sair do programa");
    }
}
