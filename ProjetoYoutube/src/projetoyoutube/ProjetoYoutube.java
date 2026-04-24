package projetoyoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {

        // Criando usuários
        Usuario u1 = new Usuario("Luiz Fernando", 22, 'M', "rock123");
        Usuario u2 = new Usuario("Ana clara", 19, 'F', "Ddino");

        // Criando vídeos
        Video v1 = new Video("O pior REALITY de TODOS");
        Video v2 = new Video("Caneta Azul Cantando");

        // João assiste vídeo 1
        Visualizacao vis1 = new Visualizacao(u1, v1);
        v1.play();
        v1.like();
        vis1.avaliar(8);
        v1.pause();

        // Maria assiste vídeo 1
        Visualizacao vis2 = new Visualizacao(u2, v1);
        v1.play();
        v1.like();
        v1.like();
        vis2.avaliar(9);
        v1.pause();

        // João assiste vídeo 2
        Visualizacao vis3 = new Visualizacao(u1, v2);
        v2.play();
        vis3.avaliar(7);
        v2.pause();

        // Resultado final
        System.out.println("=== USUÁRIOS ===");
        System.out.println(u1);
        System.out.println(u2);

        System.out.println("\n=== VÍDEOS ===");
        System.out.println(v1);
        System.out.println(v2);
    }
}