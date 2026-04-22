package aula2_visibilidade;

//O que é visibilidade

public class ClassePrincipal {
    public static void main(String[] args) {
        Caneta2 c2 = new Caneta2();

        c2.modelo = "BIC Cristal"; //Vai exibir, pois é publico
        c2.cor = "Azul";
        // c2.ponta = 0.5; Não é possivel, pois é privado

        /*Vai exibir, pois esse atributo esta
        dentro deuma classe que utiliza a caneta*/
        c2.carga = 80;
        //c2.tampado = true;
        c2.destampar();
        c2.tampar();
        c2.status();
        c2.rabiscar();



    }
}
