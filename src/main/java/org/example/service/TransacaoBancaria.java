package org.example.service;

import org.example.domain.Conta;

public class TransacaoBancaria {

    private Double valor;
    private Conta origem;
    private Conta destino;

    public void realizarTransacao(Conta origem, Conta destino, double valor) {
        if (origem.getSaldoBancario() >= valor) {
            origem.debitarSaldo(valor);
            destino.creditarSaldo(valor);
        } else {
            System.out.println("Você não possui saldo suficiente para a transação.");
        }
    }
}
