/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula2;

/**
 *
 * @author Danilo
 */
public class Lapis {
    String tipo;
    boolean ponta;
    float tamanho;
    String marca;
    
    void status()
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo " + this.tipo);
        System.out.println("Tamanho " + this.tamanho);        
        System.out.println("Ponta: " + this.ponta);        
    }
    
    void apontar()
    {
        this.ponta = true;
    }
    
    void desapontar()
    {
        this.ponta = false;
    }
    
    void escrever()
    {
        if (this.ponta == true)
        {
            System.out.println("Estou escrevendo");
        }
        else
        {
            System.out.println("ERRO! Não posso escrever");
        }
    }
    
}
