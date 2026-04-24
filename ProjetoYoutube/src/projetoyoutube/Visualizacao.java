package projetoyoutube;

public class Visualizacao implements AcoesUsuarioAssistindoVideo{
    private Usuario espectador;
    private Video video;

    public Visualizacao(Usuario espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.viuMaisUm();
        this.video.addView();
    }

    public Usuario getEspectador() {
        return espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao {" +
                "\n espectador = " + espectador.getNome() +
                "\n video = " + video.getTitulo() +
                "\n reproduzindo = " + video.getReproduzindo() +
                "\n }";
    }

    @Override
    public void play() {
        this.video.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.video.setReproduzindo(false);
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
