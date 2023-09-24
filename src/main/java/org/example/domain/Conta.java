package org.example.domain;

import org.example.domain.Enum.TipoConta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta{

    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private TipoConta tipoConta;
    private Double saldoInicial;
    private Integer idConta;
    private Double saldoBancario = 0.0;
    private List<String> extrato = new ArrayList<>();

    public Conta(Pessoa pessoa1, Pessoa pessoa2, TipoConta tipoConta, Integer idConta, Double saldoInicial) {
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.tipoConta = tipoConta;
        this.idConta = idConta;
        this.saldoInicial = saldoInicial;

        if (saldoInicial < 50.00 && tipoConta == TipoConta.POUPANCA) {
            throw new IllegalArgumentException("Valor mínimo para a abertura de conta poupança: R$50,00.");
        } else if (tipoConta == TipoConta.CONJUNTA) {
            if (pessoa2 == null || pessoa1.getCpfCompanheiro() != pessoa2.getCpf()) {
                throw new IllegalArgumentException("É preciso de um companheiro para a abertura da conta conjunta.");
            }
        } else {
            saldoBancario += saldoInicial;
        }
    }

    public boolean debitarSaldo(double valor) {
        if (valor > 0 && valor <= saldoBancario) {
            saldoBancario -= valor;
            extrato.add("-" + valor + " " + LocalDate.now() + " Saldo: " + this.getSaldoBancario());
            return true;
        } else {
            return false;
        }
    }

    public void creditarSaldo(double valor) {
        if (valor > 0) {
            saldoBancario += valor;
            extrato.add("+" + valor + " " + LocalDate.now() + " Saldo: " + this.getSaldoBancario());
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public String getPessoa1_nome() {
        return pessoa1.getNome();
    }

    public Double getSaldoBancario() {
        return saldoBancario;
    }
}
