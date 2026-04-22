package aula5_encapsulamento;

public class ClassePrincipal {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.abrirMenu();
        System.out.println(c.getVolume());

    }
}
