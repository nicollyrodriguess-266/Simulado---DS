/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeZoo.Model;

/**
 *
 * @author cacal
 */
public class Arara extends Animal{

    public Arara(String nome, int idade, TipoHabitat habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("A arara está cantando!!");
    }
    
}
