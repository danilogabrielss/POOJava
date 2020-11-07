/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula2ex2;

/**
 *
 * @author Danilo
 */
public class PooAula2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fonte f1 = new Fonte();
        f1.potencia = 550f;
        f1.bivolt = "110v";
        f1.cooler = 120;
        f1.ligado = false;
        f1.marca = "EVGA";
        f1.selo = "80 plus white";
        f1.status();
        f1.ligar();
    }
    
}