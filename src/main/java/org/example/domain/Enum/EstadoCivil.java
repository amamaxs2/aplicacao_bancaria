package org.example.domain.Enum;

public enum EstadoCivil {
    SOLTEIRO(1, "Solteiro(a)"),
    CASADO(2, "Casado(a)"),
    UNIAOESTAVEL(3, "União estável"),
    VIUVO(4, "Viúvo(a)");

    private int codigo;
    private String nome;

    EstadoCivil(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
