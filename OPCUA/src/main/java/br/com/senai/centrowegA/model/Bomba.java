package br.com.senai.centrowegA.model;

public  class Bomba {

    private String id;
    private Sensor temperatura;
    private double limiteSeguranca = 40.0;

    public Bomba(String id) {
        this.id = id;
        this.temperatura = new Sensor(45.5, "Celsius");
    }

        public String getId() { return id; }
        public Sensor getTemperatura() { return temperatura; }
        public double getLimiteSeguranca() { return limiteSeguranca; }

        // No OPC UA, isso seria um "Callable Method"
        public void executarMetodo(String acao) {
            System.out.println(">>> COMANDO OPC UA: Enviando ordem de [" + acao + "] para " + id);
        }
     }
