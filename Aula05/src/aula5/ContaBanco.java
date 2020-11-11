package aula5;

public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(String t){        
        setStatus(true);
        setTipo(t);
        if(tipo == "CC")
        {
            this.saldo = 50f;
        }
        else 
        {
            if(t == "CP")
            {
                saldo = 150f;
            }
        }
    }
    public void fecharConta(){
        if(this.saldo > 0)
        {
            System.out.println("A conta ainda tem dinheiro");
        }
        else
        {
            if(this.saldo < 0)
            {
            System.out.println("A conta tem debitos a quitar");
            }
            else
            {
                this.status = false;
            }
        }
    }
    
    public void depositar(float v){
        if(this.status == true)
        {
            setSaldo(getSaldo() + v);
        }
    }
    
    public void sacar(float v){
        if(this.status == true )
        {
            if(this.saldo > v)
            {
            setSaldo(getSaldo() - v);
            }
            else
            {
                System.out.println("Saldo insuficiente");
            }
        }
        else
        {
            System.out.println("Impossivel sacar.");
        }
    }

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;        
    }
    
    public void pagarMensal(){
        //if()
    }

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

    public boolean isStatus() {
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
