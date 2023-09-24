package org.example.service;

import org.example.domain.Conta;

public class TransacaoBancaria {

    private Double valor;

    public String realizarTransacao(Conta origem, Conta destino, double valor) throws Exception{
        if (origem.getSaldoBancario() >= valor) {
            origem.debitarSaldo(valor);
            destino.creditarSaldo(valor);
        } else {
            throw new Exception("Você não possui saldo suficiente para a transação.");
        }
        return origem.getPessoa1_nome() + " " + valor;
    }
}
