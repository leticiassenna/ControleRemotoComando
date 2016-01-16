/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.controleremotocomando.model;

import br.ifes.leticia.controleremotocomando.control.Controle;
import br.ifes.leticia.controleremotocomando.control.Objeto;

/**
 *
 * @author Leticia
 */
public class ControleExecuta implements Controle{
    Objeto classeObjeto;
    
    public ControleExecuta(Objeto obj){
        this.classeObjeto = obj;
    }

    @Override
    public void executar() {
        classeObjeto.ligar();
    }
}
