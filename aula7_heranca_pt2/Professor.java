package aula7_heranca_pt2;

import aula6_heranca_pt1.Pessoa;

public final class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAum(double aum) {
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
