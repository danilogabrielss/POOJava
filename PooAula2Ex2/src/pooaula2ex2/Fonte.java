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
public class Fonte {
    float potencia;
    float cooler;
    boolean ligado;
    String bivolt;
    String marca;
    String selo;
    
    void ligar()
    {
        if (ligado == true)
        {
            System.out.println("O computador irá ligar");
        }
        else
        {
            System.out.println("ERRO! O computador não irá ligar");
        }
    }
    
    void status()
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Potencia " + this.potencia + "W");
        System.out.println("Tensão " + this.bivolt);        
        System.out.println("Selo " + this.selo);
        System.out.println("Tamanho do cooler " + this.cooler + "mm");        
    }
}
