package projetoyoutube;

public class Usuario extends Pessoa {
    private String login;
    private int totAssistido;

    public Usuario(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public void viuMaisUm() {
        this.totAssistido += 1;
    }

    @Override
    public String toString() {
        return "Usuarios {" +
                "\n login = '" + login + '\'' +
                "\n totAssistido = " + totAssistido +
                "\n }";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
