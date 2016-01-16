/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.controleremotocomando.control;

/**
 *
 * @author Leticia
 */
public class Carro {
    private boolean ligado;
    
    public Carro(){
        ligado = false;
        System.out.println("Carro está deslidado!");
    }
    
    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("Desligando o carro...");
        }
    }
    
    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("Ligando o carro...");
        }
    }
}
