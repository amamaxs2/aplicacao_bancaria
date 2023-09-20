package org.example.service;

import org.example.domain.Exceptions.CpfException;

public class FormatadorService {

    public String formatadorCpf(String cpf) throws CpfException {

        if(cpf.replaceAll("[^0-9]","").length() != 11){
            throw new CpfException();
        }else{
            return cpf.replaceAll("[^0-9]","");
        }
    }
}
