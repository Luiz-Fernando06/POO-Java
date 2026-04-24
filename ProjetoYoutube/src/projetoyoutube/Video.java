package projetoyoutube;

public class Video implements AcoesVideo {

    private String titulo;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void addView() {
        this.views++;
    }

    private Comentario[] comentarios = new Comentario[100];
    private int totComentarios = 0;

    public void mostrarComentarios() {
        for (int i=0; i < totComentarios; i++) {
            System.out.println(comentarios[i]);
        }
    }

    @Override
    public void curtirComentario(int index, Usuario usuario) {
        if (index >= 0 && index < totComentarios) {
            comentarios[index].like(usuario);
        } else {
            System.out.println("Comentario não existe");
        }
    }

    @Override
    public void adicionarComentario(Usuario usuario, String texto) {
        if (totComentarios < comentarios.length) {
            Comentario c = new Comentario(usuario, this,texto);
            comentarios[totComentarios] = c;
            totComentarios++;
        } else {
            System.out.println("Limite de Comentario atingido");
        }
    }
    private Usuario[] usuariosQueCurtiram = new Usuario[100];
    private int totCurtidas = 0;

    @Override
    public void like(Usuario usuario) {
        for (int i = 0; i < totCurtidas; i++) {
            if (usuariosQueCurtiram[i] == usuario) {
                this.totCurtidas--;
                return;
            }
        }

        usuariosQueCurtiram[totCurtidas] = usuario;
        this.totCurtidas++;

    }

    @Override
    public String toString() {
        return "Video {" +
                "\n titulo = '" + getTitulo() + '\'' +
                "\n views = " + getViews() +
                "\n curtidas = " + totCurtidas +
                "\n reproduzindo = " + getReproduzindo() +
                "\n}";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
