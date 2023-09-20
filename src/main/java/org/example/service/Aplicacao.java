package org.example.service;

import org.example.domain.Conta;

public class Aplicacao {

    private Double valorInvestido;
    private Conta contaInvestida;
    private Integer tempoAplicado;
    private int cont;

    public void realizarAplicacao(Conta contaInvestida, Double valorInvestido, Integer tempoAplicado) {

        if (tempoAplicado < 25) {
            System.out.println("Não é possível realizar uma aplicação por este período.");
        } else if (tempoAplicado >= 25 && valorInvestido > 0.0) {
            for ( cont = 0; cont <= tempoAplicado; cont++)
                valorInvestido += valorInvestido * 0.01;
        }

    }
}
