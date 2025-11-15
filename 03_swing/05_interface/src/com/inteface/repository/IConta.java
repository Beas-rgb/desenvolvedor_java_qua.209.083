package com.inteface.repository;

public interface IConta {
    public String consultarDados();
    public double depositar(double valor);
    public double sacar(double valor);
    public double falta(double valor);
}