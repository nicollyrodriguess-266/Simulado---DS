/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeUsuario.model;

/**
 *
 * @author cacal
 */
public class Usuario {
    private String login;
    private String senha; 
    NivelDeAcesso nivel; 
    private boolean ativo = true; 
    
    
    public Usuario(String login, String senha, NivelDeAcesso nivel) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }
    
    public void autenticar(String senha){
        if (senha.equals(this.senha) && ativo == true){
            System.out.println("Acesso autorizado!!");
           
        }else{
            System.out.println("Acesso negado, senha incorreta ou usuario inativo!");
        } 
    }
    public void deseativar(){
        ativo = false; 
        System.out.println("USUARIO DESATIVADO !!!");
    }
    
    
     public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public NivelDeAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeAcesso nivel) {
        this.nivel = nivel;
    }
    public void info(){
        System.out.println("Nome do usuario: " + getLogin());
        System.out.println("Nivel de acesso: " + getNivel()); 
    }
    
    
    
  
    
}
