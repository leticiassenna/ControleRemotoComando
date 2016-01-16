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
public class Portao {
    private boolean aberto;
    
    public Portao(){
        aberto = false;
        System.out.println("Portão está fechado!");
    }
    
    public void desligar(){
        if(aberto){
            aberto = false;
            System.out.println("Fechando o portão...");
        }
    }
    
    public void ligar(){
        if(!aberto){
            aberto = true;
            System.out.println("Abrindo o portão...");
        }
    }
}
