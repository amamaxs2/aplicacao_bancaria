package org.example.domain.Enum;

public enum TipoConta {
    POUPANCA(1, "Conta poupança"),
    SALARIO(2, "Conta salário"),
    CORRENTE(3, "Conta corrente"),
    CONJUNTA(4, "Conta conjunta");

    private Integer codigo;
    private String nome;

    TipoConta(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

}
