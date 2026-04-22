package exercicio1;

import java.util.Scanner;
import java.util.Random;

public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        ContaBanco p = new ContaBanco();

        int opcao=0;


        do {
            System.out.println("|----------------------------|");
            System.out.println("|=========>Bradesco<=========|");
            System.out.println("|----------------------------|");
            System.out.println("> 1 - Criar Conta Bancaria ");
            System.out.println("> 2 - Depositar ");
            System.out.println("> 3 - Sacar ");
            System.out.println("> 4 - Pagar Mensalidade");
            System.out.println("> 5 - Fechar Conta Bancaria ");
            System.out.println("> 6 - Visualizar Conta ");
            System.out.println("> 7 - Sair ");
            System.out.print("Digite uma opcão > ");
            opcao = ler.nextInt();
            ler.nextLine(); //Limpar buffer

            switch (opcao) {
                case 1:
                    if(!p.getStatus()) {
                        p.setNumConta(aleatorio.nextInt(1000));
                        System.out.print("Digite seu Nome: ");
                        p.setDono(ler.nextLine());

                        System.out.print("Digite o tipo da conta ( CC ou CP ): ");
                        p.abrirConta(ler.nextLine());

                    } else {
                        System.out.println("Sua conta Já existe!");
                    }
                    break;

                case 2:
                    if (p.getStatus()) {
                        System.out.println("Digite o valor que deseja depositar: ");
                        p.depositar(ler.nextDouble());
                    } else {
                        System.out.println("Essa conta não existe!");
                    }
                    break;

                case 3:
                    if (p.getStatus()) {
                        System.out.println("Digite o valor que deseja sacar: ");
                        p.sacar(ler.nextDouble());
                    } else {
                        System.out.println("Essa conta não existe!");
                    }
                    break;

                case 4:
                    p.pagarMensal();
                    break;

                case 5:
                    p.fecharConta();
                    break;

                case 6:
                    if (!p.getStatus()) {
                        System.out.println("Não é possivel visualizar sua conta, pois ela não existe!");
                    } else {
                        p.estadoAtual();
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcão invalida");
                    break;
            }

        } while (opcao != 7);

        ler.close();

    }
}
