package org.example.domain;

import org.example.domain.Enum.EstadoCivil;
import org.example.service.FormatadorService;

public class Pessoa extends Titular implements ConfirmacaoCadastro {

    private String cpf;
    private String nome;
    private EstadoCivil estadoCivil;
    private String profissao;
    private String genero;
    private String cpfCompanheiro;

    public Pessoa(String numeroContato, String endereco, String email, String cpf, String nome,
                  EstadoCivil estadoCivil, String profissao, String genero, String cpfCompanheiro) {
        super(numeroContato, endereco, email);
        this.cpf = cpf;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.genero = genero;
        this.cpfCompanheiro = cpfCompanheiro;
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

    public String getCpfCompanheiro() {
        return cpfCompanheiro;
    }

    @Override
    public String cpfFormatado(String cpf) {
        return new FormatadorService().formatadorCpf(cpf);
    }
}
