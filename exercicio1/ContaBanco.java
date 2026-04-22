package exercicio1;

public class ContaBanco {
    //Atributos
    private long numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Metodos especiais

    //Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(long n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //Metodos
    public void estadoAtual() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------");
    }

    public void abrirConta(String t) {
        //CC para conta corrente e CP para conta poupança
        this.setTipo(t);
        if (t.equals("CC") || t.equals("cc")) {
            this.setStatus(true);
            this.setSaldo(50);
            System.out.println("Conta Corrente aberta com sucesso!");

        } else if (t.equals("CP") || t.equals("cp")) {
            this.setStatus(true);
            this.setSaldo(150);
            System.out.println("Conta Poupança aberta com sucesso!");

        } else {
            System.out.println("Erro: Tipo de conta invalida. Escolha entre CC ou CP");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois possui dinheiro!");

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois ela está em debito!");

        } else if (!this.getStatus()) {
            System.out.println("Essa conta já está fechada!");

        } else {
            System.out.println("Conta Fechada");
            this.setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Valor depositado com sucessor na conta de "+this.getDono()+"!");
        } else {
            System.out.println("Erro: Essa conta está fechada ou não existe");
        }
    }

    public void sacar(double valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("ERRO: Conta não existe ou está fechada");
        }
    }

    public void pagarMensal() {
        double valor = 0;
        if (this.getTipo().equals("CC") || this.getTipo().equals("cc")) {
            valor = 12;
        } else if (this.getTipo().equals("CP") || this.getTipo().equals("cp")) {
            valor = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else  {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("ERRO: Conta fechada");
        }
    }

}
