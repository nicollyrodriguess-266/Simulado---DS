/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaDeZoo.Teste;

import br.edu.etec.SistemaDeZoo.Model.Animal;
import br.edu.etec.SistemaDeZoo.Model.Arara;
import br.edu.etec.SistemaDeZoo.Model.Golfinho;
import br.edu.etec.SistemaDeZoo.Model.Leao;
import br.edu.etec.SistemaDeZoo.Model.TipoHabitat;

/**
 *
 * @author cacal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal leao = new Leao("Fred " , 10 , TipoHabitat.Terrestre); 
       Animal golfinho = new Golfinho("Ted ", 15 , TipoHabitat.Aquatico);
       Animal arara = new Arara("lili ", 10 , TipoHabitat.Aereo);
       golfinho.info();
       golfinho.emitirSom();
       
       leao.info();
       leao.emitirSom();
       
       arara.info();
       arara.emitirSom();
       
    }
    
}
