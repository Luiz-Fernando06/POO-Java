package aula1_ObjetoEclasse;

//Oq é objeto, this, e instancia(new)

public class ClassePrincipal {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c2.modelo = "BIGMACREAAALLLL";
        c2.cor = "Cor de macaco";
        c2.ponta = 1.5;
        c2.carga = 70;
        c2.destampar();
        c2.status();
        c2.rabiscar();


    }
}
