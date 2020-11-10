package aula5;

public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta(){
        this.status = true;
    }
    public void fecharConta(){
        if(saldo == 0 && this.status == true)
        {
        this.status = false;
        }
        else
        {
            System.out.println("ERRO! Não é possivel fechar a sua conta");
        }
    }
}
