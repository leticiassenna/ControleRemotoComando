/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.controleremotocomando.app;

import br.ifes.leticia.controleremotocomando.control.Carro;
import br.ifes.leticia.controleremotocomando.control.Controle;
import br.ifes.leticia.controleremotocomando.control.Objeto;
import br.ifes.leticia.controleremotocomando.control.Portao;
import br.ifes.leticia.controleremotocomando.model.ControleDesfaz;
import br.ifes.leticia.controleremotocomando.model.ControleExecuta;

/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String[] args){
        Objeto objeto;
        Controle controle;
        
        //CARRO
        objeto = new Carro();
        controle = new ControleExecuta(objeto);
        controle.executar();
        controle = new ControleDesfaz(objeto);
        controle.executar();
        
        //PORTAO
        objeto = new Portao();
        controle = new ControleExecuta(objeto);
        controle.executar();
        controle = new ControleDesfaz(objeto);
        controle.executar();
        
    }
}
