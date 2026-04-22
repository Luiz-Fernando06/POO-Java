package aula8_polimofismo_sobreposicao;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();


        m.setPeso(35.3);
        m.setCorPelo("Marrom");

        m.locomover();
        c.locomover();
        a.locomover();

        k.emitirSom();
        c.emitirSom();
    }
}
