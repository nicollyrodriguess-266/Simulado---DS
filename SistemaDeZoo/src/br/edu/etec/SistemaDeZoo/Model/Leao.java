/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeZoo.Model;

/**
 *
 * @author cacal
 */
public class Leao extends Animal {

    public Leao(String nome, int idade, TipoHabitat habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
         System.out.println("A o leão está rugindo!");
    }
    
}
