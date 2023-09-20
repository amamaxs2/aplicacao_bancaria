package org.example.service;

import org.example.domain.Conta;

import java.time.LocalDate;
import java.util.List;

public class ExtratoPorPeriodo {

    private Conta conta1;

    public void gerarExtratoPorPerido(Conta conta1, List<String> extrato ) {
        if (conta1.creditarSaldo(double valor)) {
            extrato.add("+" + valor + " " + LocalDate.now() + " Saldo: " + conta1.getSaldoBancario() );
        } else if (conta1.debitarSaldo(double valor)) {
            extrato.add("-" + valor + " " + LocalDate.now() + " Saldo: " + conta1.getSaldoBancario() );
        }
    }

}
