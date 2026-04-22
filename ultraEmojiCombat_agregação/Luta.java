package ultraEmojiCombat_agregação;

import java.util.Random;
public class Luta implements Lutas {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean isAprovado;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return isAprovado;
    }

    private void setAprovado(boolean aprovado) {
        isAprovado = aprovado;
    }

    @Override
    public void macarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            System.out.println("Luta Marcada");
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Impossivel macar luta");
        }
    }

    @Override
    public void luta() {
        Random random = new Random();
        if (this.isAprovado()) {
            this.desafiado.apresentar();
            System.out.println();
            this.desafiante.apresentar();
            System.out.println();
            int vencedor = random.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Ganhador: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perdeLuta();
                    break;

                case 2:
                    System.out.println("Ganhador: "+ desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perdeLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode aconceter");
        }
    }
}
