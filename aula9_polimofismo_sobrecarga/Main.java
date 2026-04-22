package aula9_polimofismo_sobrecarga;

public class Main {
    static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        c.reagir("ola");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(19,80.5);
        c.reagir(false);
        c.reagir(true);
    }
}
