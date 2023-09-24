package org.example;

import org.example.domain.Conta;
import org.example.domain.Enum.EstadoCivil;
import org.example.domain.Enum.TipoConta;
import org.example.domain.Pessoa;
import org.example.service.Aplicacao;
import org.example.service.Financiamento;
import org.example.service.TransacaoBancaria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServicesTest {

    @Test
    public void financiamentoTest() throws Exception {
        Assertions.assertEquals("Meses Financiado: 20 Valor financiado: 1002.50", new Financiamento().realizarFinanciamento(1000.50,20));
    }

    @Test
    public void aplicacaoTest() throws Exception {
        Pessoa pessoa1 = new Pessoa("44997131234", "Brasil", "odoamanda.1970@gmail.com", "12345678910", "Amanda", EstadoCivil.SOLTEIRO, "Tosadora de porquinhos", "Feminino", null) ;
        Conta Amanda = new Conta(pessoa1,null, TipoConta.CORRENTE, 1,1001.0);
        Assertions.assertEquals("Valor: 1094.57", new Aplicacao().realizarAplicacao( Amanda, 1000.50,30));
    }

    @Test
    public void transacaoTest() throws Exception {
        Pessoa pessoa1 = new Pessoa("44997131234", "Brasil", "odoamanda.1970@gmail.com", "12345678910", "Amanda", EstadoCivil.SOLTEIRO, "Tosadora de porquinhos", "Feminino", null) ;
        Conta Amanda = new Conta(pessoa1,null, TipoConta.CORRENTE, 1,1001.0);
        Pessoa pessoa2 = new Pessoa("44997131234", "Brasil", "odoamanda.1970@gmail.com", "12345678910", "Rubens", EstadoCivil.SOLTEIRO, "Tosadora de porquinhos", "Feminino", null) ;
        Conta Rubens = new Conta(pessoa2,null, TipoConta.CORRENTE, 2,0.0);
        Assertions.assertEquals("Amanda 1000.0", new TransacaoBancaria().realizarTransacao(Amanda, Rubens, 1000.0));
    }

}
