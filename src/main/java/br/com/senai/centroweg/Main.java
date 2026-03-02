package br.com.senai.centroweg;


public class Main {
    public static void main(String[] args) {

        int[] motorX = { 45, 1, 1200 };


        int valor1 = motorX[0];

        if (valor1 > 40) {
            System.out.println("ALERTA: O valor " + valor1 + " passou do limite!");
        }

    }
}