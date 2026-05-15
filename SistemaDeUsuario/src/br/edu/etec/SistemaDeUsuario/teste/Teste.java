/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeUsuario.teste;

import br.edu.etec.SistemaDeUsuario.model.NivelDeAcesso;
import br.edu.etec.SistemaDeUsuario.model.Usuario;

/**
 *
 * @author cacal
 */
public class Teste {
    public static void main(String args[]){
        Usuario usuario = new Usuario("Nicolly", "123", NivelDeAcesso.convidado);
        usuario.info();
        usuario.autenticar("123");
        usuario.getNivel();

    }
}
