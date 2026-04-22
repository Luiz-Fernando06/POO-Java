package aula3_get_set_construtor;

//Metodos especiais
import java.util.Scanner;

public class ClassePincipal {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Azul", 0.7);
        Scanner saida = new Scanner(System.in);

        System.out.println("Digite o nome do modelo da caneta: ");
        c1.setModelo(saida.nextLine());

        System.out.println("Digite a Carga da caneta: ");
        c1.setCarga(saida.nextInt());

        System.out.println("\nO modelo da caneta é: " + c1.getModelo());
        System.out.println("A cor da caneta é: " + c1.getCor());

        c1.status();



    }
}
