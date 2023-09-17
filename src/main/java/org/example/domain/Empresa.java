package org.example.domain;

public class Empresa extends Titular{
    private String razaoSocial;
    private String cnpj;
    private String ramoAtividade;
    private Integer anoDeFundacao;
    private Integer quantidadeFuncionarios;

    public Empresa(String numeroContato, String endereco, String email, String razaoSocial, String cnpj, String ramoAtividade, Integer anoDeFundacao,
                   Integer quantidadeFuncionarios) {
        super(numeroContato, endereco, email);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ramoAtividade = ramoAtividade;
        this.anoDeFundacao = anoDeFundacao;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
}
