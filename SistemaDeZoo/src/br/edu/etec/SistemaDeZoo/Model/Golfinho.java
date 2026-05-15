/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeZoo.Model;

/**
 *
 * @author cacal
 */
public class Golfinho extends Animal {

    public Golfinho(String nome, int idade, TipoHabitat habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("O golfinho está assobiando!!");
    }
    
}
