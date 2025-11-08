package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia as classes
        Scanner leia = new Scanner(System.in);

        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaração de variáveis
        String combustivel;

        // entrada de dados
        System.out.println("---Informe os dados do carro---\n");

        System.out.println("Informe o fabricante do carro: ");
        carro.fabricante = leia.nextLine();

        System.out.println("Informe o modelo do carro: ");
        carro.modelo = leia.nextLine();

        System.out.println("Informe o ano do carro: ");
        carro.ano = leia.nextLine();

        System.out.println("Informe a cor do carro: ");
        carro.cor = leia.nextLine();

        System.out.println("Informe a placa do carro: ");
        carro.placa = leia.nextLine();

        // padrão de combustível
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuário informa o combustível
        System.out.println("\nInforme o combustível do carro: \n");
        System.out.println("1 - Gasolina\n2 - Etanol\n3 - Flex\n4 - Diesel \n5 - Elétrico\n");
        combustivel = leia.nextLine();

        switch (combustivel) {
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default:
                System.out.println("Motor inexistente!");
        }

        // entrada de dados da moto
        System.out.println("\n---Informe os dados da moto---\n");
        System.out.println("Informe o fabricante da moto: ");
        moto.fabricante = leia.nextLine();

        System.out.println("Informe o modelo da moto: ");
        moto.modelo = leia.nextLine();

        System.out.println("Informe o ano da moto: ");
        moto.ano = leia.nextLine();

        System.out.println("Informe a cor da moto: ");
        moto.cor = leia.nextLine();

        System.out.println("Informe a placa da moto: ");
        moto.placa = leia.nextLine();

        // impressão dos dados
        System.out.println("\n---Veiculos---\n");
        carro.exibirDados();
        moto.exibirDados();

        leia.close();
    }
}
