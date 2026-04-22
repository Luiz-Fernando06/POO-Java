package aula1_ObjetoEclasse;

//Oq é objeto, this, e instancia(new)

public class Caneta {
    //Atributos
    String modelo = "Desconhecido";
    String cor;
    double ponta;
    int carga;
    boolean tampado;

    //Metodos
    void status() {
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

    void rabiscar() {
        if (this.tampado == true) {
            System.out.println("ERRO: Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    void tampar() {
        this.tampado = true;
    }

    void destampar() {
        this.tampado = false;
    }

}
