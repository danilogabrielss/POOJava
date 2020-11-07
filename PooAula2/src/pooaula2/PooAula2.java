package pooaula2;

/**
 *
 * @author Danilo
 */
public class PooAula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lapis l1 = new Lapis();
        l1.marca = "Faber Castell";
        l1.ponta = false;
        l1.tamanho = 10f;
        l1.tipo = "2B";
        //l1.apontar();
        //l1.status();
        //l1.escrever();
        
        Lapis l2 = new Lapis();
        l2.marca = "Arcor";
        l2.ponta = true;
        l2.tamanho = 7f;
        l2.tipo = "HB";
        l2.desapontar();
        l2.status();
        l2.escrever();
    }
    
}
