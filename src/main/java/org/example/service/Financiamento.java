package org.example.service;

public class Financiamento {

    private Double valorFinanciado;
    private Integer mesesFinanciado;

    public void realizarFinanciamento(Double valorFinanciado, Integer mesesFinanciado) throws Exception {
        if (mesesFinanciado < 18) {
            throw new Exception("Opa! Você precisa de pelo menos 18 meses para realizar um financiamento!");
        } else if(mesesFinanciado >= 18 && mesesFinanciado < 120) {
            valorFinanciado += valorFinanciado * 0.002;
        } else if (mesesFinanciado >= 120 && mesesFinanciado <= 240) {
            valorFinanciado += valorFinanciado * 0.004;
        } else if (mesesFinanciado > 240 && mesesFinanciado <= 360) {
            valorFinanciado += valorFinanciado * 0.009;
        } else {
            throw new Exception("Opa! Você não pode parcelar por mais de 360 meses.");
        }
    }

}
