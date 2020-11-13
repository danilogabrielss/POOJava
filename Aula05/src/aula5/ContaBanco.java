package aula5;

public class ContaBanco {
//Atributos

    public float numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Construtor
    public ContaBanco() {
        float saldo;
        boolean status;
        this.saldo = 0;
        this.status = false;
    }

    //Metodos Personalizados
    public void status() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        setStatus(true);
        setTipo(t);
        if (tipo == "CC") {
            this.saldo = 50f;
        } else if (t == "CP") {
            saldo = 150f;
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta tem debitos a quitar");
        } else {
            this.setStatus(false);
            System.out.println("COnta fechada ocm sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de " + v + " foi realizado com sucesso");
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12f;
        } else if (this.getTipo() == "CP") {
            v = 20f;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar!");
        }
    }

    //Metodos Especiais
    public float getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
