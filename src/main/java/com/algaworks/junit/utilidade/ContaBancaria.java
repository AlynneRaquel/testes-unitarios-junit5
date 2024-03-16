package com.algaworks.junit.utilidade;

import java.math.BigDecimal;

public class ContaBancaria {

    private BigDecimal saldo;

    public ContaBancaria(BigDecimal saldo) {
        if (saldo == null){
            throw new IllegalArgumentException("Valor inválido");
        }

        this.saldo = saldo;
    }

    public void saque(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0  ) {
            throw new IllegalArgumentException("Valor inválido ou nulo");
        }

        this.saldo =  saldo().subtract(valor);
    }

    public void deposito(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0  ) {
            throw new IllegalArgumentException("Valor inválido ou nulo");
        }

        this.saldo =  saldo().add(valor);
    }

    public BigDecimal saldo() {
        return saldo;
    }
}
