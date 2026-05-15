/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeNotificacao.Model;

/**
 *
 * @author cacal
 */
public  abstract class Notificacao {
    String destinatario;
    String mensagem; 
    TipoNotificacao tipo;
   
    
    public Notificacao(String destinatario,String mensagem, TipoNotificacao tipo){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
    
    public void info(){
        System.out.print("-----Sistema de envio de mensagem----");
        System.out.println("Destinatario: " + destinatario);
        System.out.print("Mensagem: " + mensagem );
        System.out.println(tipo);
       
    }
    
    public TipoNotificacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacao tipo) {
        this.tipo = tipo;
    }
     
    public void enviar(){
        System.out.println("Mensagem enviada!! \n ");
    }
}
