package projetoyoutube;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Comentario {

    LocalDate dataAtual = LocalDate.now();
    DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Usuario autor;
    private Video video;
    private String texto;
    private String data;
    private int like;

    public Comentario(Usuario autor, Video video, String texto) {
        this.autor = autor;
        this.video = video;
        this.texto = texto;
        this.data = dataAtual.format(formatoBR);
        this.like = 0;
    }

    private Usuario[] usuariosQueCurtiram = new Usuario[100];
    private int totalLike = 0;

    public void like(Usuario usuario) {
        for (int i = 0; i < totalLike; i++) {
            if (usuariosQueCurtiram[i] == usuario) {
                totalLike--;
                return;
            }
        }

        if (totalLike < usuariosQueCurtiram.length) {
            usuariosQueCurtiram[totalLike] = usuario;
            totalLike++;
        }
    }

    @Override
    public String toString() {
        return "Comentario {" +
                "\n data = " + data +
                "\n autor = " + autor.getLogin() +
                "\n video = " + video.getTitulo() +
                "\n texto = '" + texto + '\'' +
                "\n like = " + totalLike +
                "\n }";
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
