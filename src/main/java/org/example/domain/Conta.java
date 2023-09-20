package org.example.domain;

import org.example.domain.Enum.TipoConta;

public class Conta implements ConfirmacaoCadastro{

    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private TipoConta tipoConta;
    private Double saldoInicial;
    private Integer idConta;
    private Double saldoBancario = 0.0;

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

    public void debitarSaldo(double valor) {
        if (valor > 0 && valor <- saldoBancario) {
            saldoBancario -= valor;
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    public void creditarSaldo(double valor) {
        if (valor > 0) {
            saldoBancario += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public Double getSaldoBancario() {
        return saldoBancario;
    }
}
