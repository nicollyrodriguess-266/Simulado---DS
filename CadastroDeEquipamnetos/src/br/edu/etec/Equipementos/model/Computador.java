/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Equipementos.model;

/**
 *
 * @author Admin
 */
public class Computador extends Equipamentos {
    private String processador;
    
    public Computador(String processador, String nome, String modelo, tipoEquipamento tipo) {
        super(nome, modelo, tipo);
        this.processador = processador;
    }
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    @Override
    public void ExibirInfo(){
        super.ExibirInfo();
        
        System.out.println("Processador: "+ getProcessador());
    }
}
