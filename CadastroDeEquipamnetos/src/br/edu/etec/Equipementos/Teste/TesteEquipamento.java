/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Equipementos.Teste;

import br.edu.etec.Equipementos.model.Computador;
import br.edu.etec.Equipementos.model.tipoEquipamento;

/**
 *
 * @author Admin
 */
public class TesteEquipamento {
    public static void main(String args[]){
    Computador computador = new Computador("Lenovo", 
            "IdeaPad Slim 6", 
            " Intel Core de 13ª", 
            tipoEquipamento.Computador);
    
    computador.ExibirInfo();
}}
