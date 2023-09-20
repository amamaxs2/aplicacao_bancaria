package org.example;

import org.example.domain.Exceptions.CpfException;
import org.example.service.FormatadorService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FormatadorServiceTest {

    @Test
    public void deveFormatarCpf() throws CpfException {

        FormatadorService service = new FormatadorService();

        CpfException resultado = Assertions.assertThrows(CpfException.class, () -> service.formatadorCpf("123.123.123-999"));

        Assertions.assertEquals("O cpf informado não possui 11 caracteres.",
                resultado.getMessage());

    }
}
