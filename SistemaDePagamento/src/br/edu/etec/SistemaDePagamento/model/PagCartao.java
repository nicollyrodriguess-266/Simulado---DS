/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDePagamento.model;

/**
 *
 * @author cacal
 */
public class PagCartao extends Pagamento{
    
    private String numCartao;

    public PagCartao(double valor, String numCartao, StatusPagamento status) {
        super(valor, status);
        this.numCartao = numCartao;
    }
    
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
   
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento");
    }
    
    @Override
    public void ExibirStatus() {
        System.out.println("----SISTEMA DE PAGAMENTO----");
        if (getValor() > 0) {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("Status do pagamento: " + status);
            System.out.println("Descrição: " + status.getDescricao());

        } else {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("Status do pagamento: " + status);
            System.out.println("Descrição: " + status.getDescricao());
        }

    }
}

