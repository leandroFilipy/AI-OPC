package br.com.senai.centrowegA;


import br.com.senai.centrowegA.model.Bomba;

public class Main {
    public static void main(String[] args) {

        Bomba bombaPrincipal = new Bomba("Bomba_Caldeira_01");

        double temp = bombaPrincipal.getTemperatura().getValor();
        String unidade = bombaPrincipal.getTemperatura().getUnidade();


        if (temp > bombaPrincipal.getLimiteSeguranca()) {
            System.out.println("ALERTA: " + bombaPrincipal.getId() +
                    " superou " + bombaPrincipal.getLimiteSeguranca() + unidade);

            bombaPrincipal.executarMetodo("Resfriar");
        }

    }
}