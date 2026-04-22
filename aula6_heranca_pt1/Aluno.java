package aula6_heranca_pt1;

public class Aluno extends Pessoa {
    private long matr;
    private String curso;

    public void cancelarMatrc() {
        System.out.println("Matricular cancelada");
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
