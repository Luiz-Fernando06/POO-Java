package ultraEmojiCombat_agregação;

public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        Luta UEC = new Luta();

        l[0] = new Lutador("Pretty Boy", "França", 31,
                1.75, 68.9, 11, 3, 1);

        l[1] = new Lutador("PutsScript", "Brasil", 28,
                1.68, 57.8, 14, 2, 3);

        l[2] = new Lutador("SnapsShadow", "EUA", 35,
                1.65, 89.9, 12, 2, 1);

        l[3] = new Lutador("Dead Code", "Australia", 28,
                1.93, 81.6, 13, 0, 2);

        l[4] = new Lutador("Ufocobol", "Brasil", 28,
                1.78, 119.3, 5, 4, 3);

        l[5] = new Lutador("Nerdaard", "EUA", 30,
                1.81, 105.8, 12, 2, 4);

        for (int i=0;i<6;i++) {
            l[i].status();
            System.out.println();
        }

        UEC.macarLuta(l[4], l[5]);
        System.out.println();
        UEC.luta();

        System.out.println();
        l[0].status();
        System.out.println();
        l[1].status();


    }
}
