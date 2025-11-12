package com.combustivel.models;

public class Combustivel {
    // atributos
    private double gasolina;
    private double etanol;


    public Combustivel() {
    }


    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    // metodo proridade
    public String calcularCombustivel() {
        return (this.etanol >= this.gasolina*0.7) ? "Vai de gasolina!" : "Vai de etanol!";
    }


}
