package com.indice.models;

public class Processo {

    private String nome;
    private double peso;
    private double altura;
    private double imc;


    public Processo() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    
    // 🧮 Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // 📊 Método para classificar o IMC
    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade grau I";
        else if (imc < 40) return "Obesidade grau II";
        else return "Obesidade grau III";
    }

    public String dica() {
        String dica_imc = classificarIMC();
        if (dica_imc == "Abaixo do peso"){
            return "Você precisa comer mais, você está abaixo do peso.";
        }
        else if (dica_imc == "Peso normal") {
            return "Continuar assim, você está no peso ideal.";
        }
        else if (dica_imc == "Sobrepeso") {
            return "Você precisa comer menos, você está com sobrepeso.";
        }
        else if (dica_imc == "Obesidade grau I"){
            return "Você precisa comer menos, você está com obesidade grau I.";
        }
        else if (dica_imc == "Obesidade grau II"){
            return "Você precisa comer menos, você está com obesidade grau II.";
        }
        else{
            return "Você precisa comer menos, você está com obesidade grau III.";
        }
    }

    
}
