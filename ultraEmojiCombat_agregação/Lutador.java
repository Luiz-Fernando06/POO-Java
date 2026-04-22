package ultraEmojiCombat_agregação;

public class Lutador implements Lutadores{
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitoria, derrotas, empate;
    private double altura, peso;

    //Construtor
    public Lutador(String nome, String nacionalidade, int idade,
                   double altura, double peso, int vitoria,
                   int derrotas, int empate) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vitoria);
        this.setDerrotas(derrotas);
        this.setEmpate(empate);
    }

    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalida";

        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";

        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";

        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";

        } else {
            this.categoria = "Invalida";
        }

    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    //metodos
    @Override
    public void apresentar() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Diretamente do "+this.getNacionalidade());
        System.out.println("Pesando "+ this.getPeso()+ "KG");
        System.out.println("Com "+this.getIdade()+ " Anos e "+getAltura()+" de altura");
        System.out.println("Com "+this.getVitoria()+" vitórias e");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println("E "+this.getEmpate()+" empates");
        System.out.println("Apresentado o lutador "+this.getNome());
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Peso: "+getCategoria());
        System.out.println("vitórias: "+this.getVitoria());
        System.out.println("derrotas: "+this.getDerrotas());
        System.out.println("empates: "+this.getEmpate());
    }

    @Override
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    @Override
    public void perdeLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
}
