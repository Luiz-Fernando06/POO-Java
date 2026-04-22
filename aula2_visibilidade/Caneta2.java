package aula2_visibilidade;

public class Caneta2 {
    //Atributos
    public String modelo = "Desconhecido";
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampado;

    //Metodos
    public void status() {
        System.out.println("Status da caneta: ");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampado);

        if (this.ponta <= 0.3) {
            System.out.println("Sua ponta é Extra Fina.");

        } else if (this.ponta <= 0.5) {
            System.out.println("Sua ponta é Fina.");

        } else if (this.ponta <= 0.7) {
            System.out.println("Sua ponta é Média.");

        } else {
            System.out.println("Sua ponta é Grossa.");
        }

        System.out.println("Sua carga esta em " + this.carga + "%");
        System.out.println("Seu modelo é: " + this.modelo);
    }

    public void rabiscar() {
        if (this.tampado) {
            System.out.println("ERRO: Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampado = true;
    }

    protected void destampar() {
        this.tampado = false;
    }

}
