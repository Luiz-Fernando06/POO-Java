package projetoyoutube;

public class Visualizacao {
    private Usuario espectador;
    private Video video;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.video = filme;

        this.espectador.viuMaisUm();
        this.video.addView();
    }

    public void avaliar() {
        this.video.avaliar(5);
    }

    public void avaliar(int nota) {
        this.video.avaliar(nota);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao {" +
                "\n espectador = " + espectador +
                "\n video = " + video +
                "\n }";
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
