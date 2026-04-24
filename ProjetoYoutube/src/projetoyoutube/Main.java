package projetoyoutube;

public class Main {
    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[2];
        Video[] videos = new Video[2];
        Visualizacao[] visu = new Visualizacao[3];
        Comentario[] comentario = new Comentario[100];

        // Criando usuários
        usuarios[0] = new Usuario("Luiz Fernando", 22, 'M', "rock123");
        usuarios[1] = new Usuario("Ana clara", 19, 'F', "Ddino");

        // Criando vídeos
        videos[0] = new Video("O pior REALITY de TODOS");
        videos[1] = new Video("Caneta Azul Cantando");

        // Luiz assiste vídeo: Caneta Azul Cantando
        visu[0] = new Visualizacao(usuarios[0], videos[1]);
        visu[0].play();
        videos[1].like(usuarios[0]);
        visu[0].pause();
        videos[1].adicionarComentario(usuarios[0], "Que video demoniaco");
        videos[1].adicionarComentario(usuarios[0], "12:43 AKAKKAKAKAKKAK");


        // Ana assiste vídeo: O pior REALITY de TODOS
        visu[1] = new Visualizacao(usuarios[1], videos[0]);
        visu[1].play();
        videos[0].like(usuarios[1]); // deu like
        videos[0].like(usuarios[1]); // tirou o like
        videos[0].like(usuarios[1]); // deu like novamente
        visu[1].pause();
        videos[0].adicionarComentario(usuarios[1], "Bela musica, na proxima tenta não cantar");

        // Ana assiste vídeo: Caneta Azul Cantando
        visu[2] = new Visualizacao(usuarios[1], videos[1]);
        visu[2].play();
        videos[1].like(usuarios[1]);
        videos[1].adicionarComentario(usuarios[1], "KAKAKKAKAKAK que video bom");

        //rock curti o proprio comentario no video Caneta Azul
        videos[1].curtirComentario(1,usuarios[0]);
        //Ddino curti o comentario de rock no video Caneta Azul
        videos[1].curtirComentario(1,usuarios[1]);
        //Ddino curti o segundo comentario de rock no video Caneta Azul
        videos[1].curtirComentario(0,usuarios[1]);
        //rock curti o comentario de Ddino no video O pior REALITY da HISTORIA
        videos[0].curtirComentario(0, usuarios[0]);
        //rock curti o proprio comentario
        videos[1].curtirComentario(0, usuarios[0]);
        //Se rock curtir seu comentario denovo vai descurtir agr
        videos[1].curtirComentario(0, usuarios[0]);
        //Se Ddino curtir o comentario de rock que ele já curtiu ele vai descurtir agr
        videos[1].curtirComentario(0,usuarios[1]);
        //Ddino curti seu proprio comentario
        videos[1].curtirComentario(2,usuarios[1]);

        // Resultado final
        System.out.println("=== USUÁRIOS ===");
        System.out.println(usuarios[0]);
        System.out.println(usuarios[1]);

        System.out.println("\n=== VÍDEOS ===");
        System.out.println(videos[0]);
        System.out.println(videos[1]);

        System.out.println("\n=== COMENTÁRIOS ===");
        videos[0].mostrarComentarios();
        videos[1].mostrarComentarios();

    }
}
