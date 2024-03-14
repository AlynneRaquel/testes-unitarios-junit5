package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltroNumerosTest {

    @Test
    public void deveRetornarNumerosPares() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosParesEsperados = Arrays.asList(2,4);
        List<Integer> resultadoFiltro = FiltroNumeros.numerosPares(list);
        Assertions.assertIterableEquals(numerosParesEsperados, resultadoFiltro); //valida a ordem tbm

        //opção
        Assertions.assertArrayEquals(numerosParesEsperados.toArray(new Object[]{}), resultadoFiltro.toArray(new Object[]{}));
    }

    @Test
    public void deveRetornarNumerosImpares() {
    }

    @Test
    void isPositivo() {
    }
}