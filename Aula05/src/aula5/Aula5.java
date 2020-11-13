package aula5;

public class Aula5 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(171);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);        
        
        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(666);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
                
        p1.status();
        p2.status();
    }

}
