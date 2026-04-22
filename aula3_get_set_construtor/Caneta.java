package aula3_get_set_construtor;

public class Caneta {
    //Atributos
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampado;

    //Construtor
    public Caneta(String cor, double ponta) {
        this.tampar();
        //this.cor = cor;
        this.setCor(cor);
        this.setPonta(ponta);
    }

    //Metodos especiais
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    //Metodos
    public void status() {
        System.out.println("Status da caneta: ");
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Está tampada? " + this.getTampado());

        if (this.getPonta() <= 0.3) {
            System.out.println("Sua ponta é Extra Fina.");

        } else if (this.getPonta() <= 0.5) {
            System.out.println("Sua ponta é Fina.");

        } else if (this.getPonta() <= 0.7) {
            System.out.println("Sua ponta é Média.");

        } else {
            System.out.println("Sua ponta é Grossa.");
        }

        System.out.println("Sua carga esta em " + this.getCarga() + "%");
        System.out.println("Seu modelo é: " + this.getModelo());
    }

    public void rabiscar() {
        if (this.getTampado()) {
            System.out.println("ERRO: Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.setTampado(true);
    }

    public void destampar() {
        this.setTampado(false);

    }
}
