package aula7_heranca_pt2;

public final class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando Bolsa de "+this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista! Pagamento solicitado");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
