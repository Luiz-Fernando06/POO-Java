package projetoyoutube;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected void ganharExp(){
        //this.experiencia += 1;
        setExperiencia(getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "\n nome = '" + nome + '\'' +
                "\n idade = " + idade +
                "\n sexo = " + sexo +
                "\n experiencia = " + experiencia +
                "\n}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
