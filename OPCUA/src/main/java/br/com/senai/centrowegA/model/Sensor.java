package br.com.senai.centrowegA.model;

public class Sensor {
    private double valor;
    private String unidade;

    public Sensor(double valor, String unidade) {
        this.valor = valor;
        this.unidade = unidade;
    }

    public double getValor() { return valor; }
    public String getUnidade() { return unidade; }
}