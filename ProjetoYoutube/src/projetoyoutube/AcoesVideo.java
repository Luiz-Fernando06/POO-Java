package projetoyoutube;

public interface AcoesVideo {
    public void like(Usuario usuario);
    public void adicionarComentario(Usuario usuario, String texto);
    public void curtirComentario(int index, Usuario usuario);
}
