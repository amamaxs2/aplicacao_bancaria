package org.example.domain;

public enum TipoConta {
    POUPANCA(1, "Conta poupança"),
    SALARIO(2, "Conta salário"),
    CORRENTE(3, "Conta corrente"),
    CONJUNTA(4, "Conta conjunta");

    private int codigo;
    private String nome;

    TipoConta(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

}
