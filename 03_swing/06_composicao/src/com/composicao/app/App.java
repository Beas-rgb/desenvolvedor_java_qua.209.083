package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.models.Pesssoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pesssoa motorista = new Pesssoa();
        Veiculo carro = new Veiculo();

        // entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("Informe o nome do motorista: "));
        motorista.setCpf(JOptionPane.showInputDialog("Informe o CPF do motorista: "));
        motorista.setTelefone(JOptionPane.showInputDialog("Informe o telefone do motorista: "));

        // entrada de dados do veiculo
        carro.setMarca(JOptionPane.showInputDialog("Informe a marca do veiculo: "));
        carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do veiculo: "));
        carro.setAno(JOptionPane.showInputDialog("Informe o ano do veiculo: "));
        carro.setCor(JOptionPane.showInputDialog("Informe a cor do veiculo: "));
        carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do veiculo: "));

        carro.setProprietario(motorista);

        // saida de dados
        JOptionPane.showMessageDialog(
            null,
            "Marca: " + carro.getMarca() + 
            "\nModelo: " + carro.getModelo() +
            "\nAno: " + carro.getAno() +
            "\nCor: " + carro.getCor() +
            "\nPlaca: " + carro.getPlaca() +
            "\nDono do veículo: " + carro.getProprietario().getNome()
            + "\nCPF do dono do veículo: " + carro.getProprietario().getCpf() +
            "\nTelefone do dono do veículo: " + carro.getProprietario().getTelefone()
            

        );

    }
}
