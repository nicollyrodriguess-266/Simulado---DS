/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeNotificacao.Model;

/**
 *
 * @author cacal
 */
public class Email extends Notificacao{

    public Email(String destinatario, String mensagem, TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }
    
  
    @Override
    public void info(){
        System.out.println("-----Sistema de envio de mensagem----");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensagem: " + mensagem );
        System.out.println("Tipo da mensagem: " + TipoNotificacao.email);
    }  
    
    @Override
    public void enviar(){
        System.out.println("O email foi enviado!! \n");
    }
    
}
