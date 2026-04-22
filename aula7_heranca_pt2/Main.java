package aula7_heranca_pt2;

public class Main {
    static void main(String[] args) {
        Visitante v = new Visitante();
        Aluno a = new Aluno();
        Bolsista b = new Bolsista();

        v.setNome("Pedro");
        v.setIdade(22);
        v.setSexo('M');

        a.setNome("Luiz");
        a.setMatr(1112);
        a.setCurso("Informatica");
        a.setIdade(16);
        a.setSexo('M');
        a.pagarMensalidade();

        b.setMatr(11234);
        b.setNome("Jubileu");
        b.setBolsa(12.5);
        b.setSexo('M');
        b.pagarMensalidade();


    }
}
