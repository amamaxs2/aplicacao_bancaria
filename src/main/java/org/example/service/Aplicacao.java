package org.example.service;

import org.example.domain.Conta;

public class Aplicacao {

    public String realizarAplicacao(Conta contaDoInvestidor, Double valorInvestido, Integer tempoAplicado) throws Exception {

        if (tempoAplicado < 25) {
            throw new Exception("Não é possível realizar uma aplicação por este período.");
        } else if (valorInvestido < 0.0) {
            throw new Exception("Não é possível realizar uma aplicação com este valor.");
        } else if (!contaDoInvestidor.debitarSaldo(valorInvestido)){
            throw new Exception("Você não possui saldo suficiente.");
        } else {
            for (int cont = 0; cont < tempoAplicado; cont++) {
                valorInvestido += valorInvestido * 0.003;
            }
            contaDoInvestidor.creditarSaldo(valorInvestido);
        }

        return "Valor: " + String.format("%.2f", valorInvestido);
    }
}
