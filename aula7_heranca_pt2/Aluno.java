package aula7_heranca_pt2;

import aula6_heranca_pt1.Pessoa;

public class Aluno extends Pessoa {
    private long matr;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno "+this.getNome());
    }

    public long getMatr() {
        return matr;
    }

    public void setMatr(long matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matr=" + matr +
                ", curso='" + curso + '\'' +
                '}';
    }
}
