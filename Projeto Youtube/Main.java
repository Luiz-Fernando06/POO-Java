package projetoyoutube;

public class Main {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        Usuario[] usuario = new Usuario[2];
        Visualizacao[] visu = new Visualizacao[5];

        video[0] = new Video("Se esse vídeo chegou até você... talvez não seja por acaso");
        video[1] = new Video("O REALITY mais ERRADO de todos");
        video[2] = new Video("a primeira briga do canetinha azul (alerta de fofura)");

        usuario[0] = new Usuario("Luiz", 19, 'M', "rock");
        usuario[1] = new Usuario("Ana", 21, 'F', "Ddino");

        visu[0] = new Visualizacao(usuario[0], video[1]);
        visu[1] = new Visualizacao(usuario[0], video[2]);
        visu[2] = new Visualizacao(usuario[1], video[2]);

        System.out.println("VÍDEOS\n----------------------------------");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        System.out.println("USUARIOS\n----------------------------------");
        System.out.println(usuario[0].toString());
        System.out.println(usuario[1].toString());
        System.out.println("VISUALIZAÇÃO\n----------------------------------");
        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());
        video[1].like();
        visu[1].avaliar();
        visu[0].avaliar(4);
    }
}
