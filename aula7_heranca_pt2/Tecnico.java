package aula7_heranca_pt2;

public final class Tecnico extends Aluno {
    private  boolean registrarProfissional;

    public final void praticar() {
        System.out.println("Praticando....");
    }

    public boolean isRegistrarProfissional() {
        return registrarProfissional;
    }

    public void setRegistrarProfissional(boolean registrarProfissional) {
        this.registrarProfissional = registrarProfissional;
    }
}
