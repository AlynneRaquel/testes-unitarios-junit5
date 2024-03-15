package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FiltroNumerosTest {

    @Test
    public void Dado_uma_lista_de_numeros_Quando_filtrar_por_pares_Entao_deve_retornar_penas_numeros_pares() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosParesEsperados = Arrays.asList(2,4);
        List<Integer> resultadoFiltro = FiltroNumeros.numerosPares(list);
        Assertions.assertIterableEquals(numerosParesEsperados, resultadoFiltro); //valida a ordem tbm

        //opção
        Assertions.assertArrayEquals(numerosParesEsperados.toArray(new Object[]{}), resultadoFiltro.toArray(new Object[]{}));
    }

    @Test
    public void Dado_uma_lista_de_numeros_Quando_filtrar_por_pares_Entao_deve_retornar_penas_impares_pares() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosImparesEsperados = Arrays.asList(1,3,5);
        List<Integer> resultadoFiltro = FiltroNumeros.numerosImpares(list);
        Assertions.assertIterableEquals(numerosImparesEsperados, resultadoFiltro);
    }

    @Test
    void isPositivo() {
    }
}