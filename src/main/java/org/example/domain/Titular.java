package org.example.domain;

public abstract class Titular {

    private String numeroContato;
    private String endereco;
    private String email;

    public Titular(String numeroContato, String endereco, String email){
        this.numeroContato = numeroContato;
        this.endereco = endereco;
        this.email = email;
    }

}
