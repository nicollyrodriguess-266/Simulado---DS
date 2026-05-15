/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.etec.SistemaDePagamento.model;

/**
 *
 * @author cacal
 */
public enum StatusPagamento {
    PENDENTE("aguardando pagamento..."),
    PROCESSANDO("Pagamento em processamento"),
    CONCLUIDO("Pagamento realizado com sucesso!"),
    FALHA("Erro ao realizar o pagamento");
    
        private String descricao;

        StatusPagamento(String descricao){
        this.descricao  = descricao;
    }
        public String getDescricao(){
        return descricao;
        }
}
