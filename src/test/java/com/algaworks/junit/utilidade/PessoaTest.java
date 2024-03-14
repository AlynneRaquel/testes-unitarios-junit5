package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void assercaoAgrupada(){
        Pessoa pessoa = new Pessoa("Alynne", "Raquel");

        //Executa todos os testes, mesmo que o primeiro falhe
        assertAll("Asserções de Pessoas",
                () -> assertEquals("Alynne", pessoa.getNome()),
                () -> assertEquals("Raquel", pessoa.getSobrenome()));
    }

}