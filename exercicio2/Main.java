package exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "H");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p[0]);
        l[1] = new Livro("POO para iniciante", "Pedro pacal", 450, p[1]);
        l[2] = new Livro("Java Avançado", "Gustavo Ze", 800, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancaPag();
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());
    }
}
