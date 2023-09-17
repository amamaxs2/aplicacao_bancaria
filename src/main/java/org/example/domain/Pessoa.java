package org.example.domain;

public class Pessoa extends Titular {

    private String cpf;
    private String nome;
    private EstadoCivil estadoCivil;
    private String profissao;
    private String genero;

    public Pessoa(String numeroContato, String endereco, String email, String cpf, String nome, EstadoCivil estadoCivil) {
        super(numeroContato, endereco, email);
        this.cpf = cpf;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
