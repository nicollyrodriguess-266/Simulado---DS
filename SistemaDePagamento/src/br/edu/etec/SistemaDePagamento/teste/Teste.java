package br.edu.etec.SistemaDePagamento.teste;

import br.edu.etec.SistemaDePagamento.model.PagCartao;
import br.edu.etec.SistemaDePagamento.model.Pagamento;
import br.edu.etec.SistemaDePagamento.model.StatusPagamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Teste {
  public static void main (String args[]){
      Pagamento pag = new PagCartao(7.0, "0001235", StatusPagamento.PROCESSANDO);
      Pagamento pag2 = new PagCartao(0.0, "8787879", StatusPagamento.FALHA);
      
      pag.ExibirStatus();
      pag.processarPagamento();
      pag.setStatus(StatusPagamento.CONCLUIDO);
      pag.ExibirStatus();
      
      pag2.processarPagamento();
      pag2.ExibirStatus();
      
  }  
}
