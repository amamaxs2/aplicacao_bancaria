package org.example.domain.Exceptions;

public class CpfException extends RuntimeException {

    public CpfException() {
        super("O cpf informado não possui 11 caracteres.");
    }

}
