package org.example.domain;

public class Conta {

    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private TipoConta tipoConta;
    private Double saldoInicial;
    private Integer idConta;
    private Double saldoBancario = 0.0;

    public Conta(Pessoa pessoa1, Pessoa pessoa2, TipoConta tipoConta, Integer idConta) {
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.tipoConta = tipoConta;
        this.idConta = idConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldoBancario() {
        return saldoBancario;
    }
}
