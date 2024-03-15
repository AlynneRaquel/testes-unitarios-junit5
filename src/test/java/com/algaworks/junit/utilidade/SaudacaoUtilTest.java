package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.function.Executable;

import static com.algaworks.junit.utilidade.SaudacaoUtil.saudar;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaudacaoUtilTest {

    @Test
    public void Dado_uma_horario_matutino_Quando_saudar_Entao_deve_retornar_bom_dia() {
        //Arrange
        int horaValida = 9;

        //Act
        String saudacao = saudar(horaValida);

        //Assert
        assertEquals("Bom dia", saudacao);
    }

    @Test
    public void Dado_uma_horario_vespertino_Quando_saudar_Entao_deve_retornar_boa_tarde() {
        int horaValida = 15;
        String saudacao = saudar(horaValida);
        assertEquals("Boa tarde", saudacao);
    }

    @Test
    public void Dado_uma_horario_noturno_Quando_saudar_Entao_deve_retornar_boa_noite() {
        int horaValida = 22;
        String saudacao = saudar(horaValida);
        assertEquals("Boa noite", saudacao);
    }

    @Test
    public void saudarTest(){
        String saudacao = SaudacaoUtil.saudar(9);
        assertEquals("Bom dia", saudacao, "Saudacao Incorreta");
    }

    @Test
    public void Dado_uma_hora_invalida_Quando_saudar_Entao_deve_lancar_exception(){
        int horaInvalida = -10;
        Executable chamadaInvalidaDeMetodo = () -> saudar(horaInvalida);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,chamadaInvalidaDeMetodo);
        assertEquals("Hora invalida", exception.getMessage());
    }

    @Test
    public void  Dado_uma_hora_valida_Quando_saudar_Entao_deve_lancar_exception() {
        int horaValida = 0;
        Executable chamadaValidaDeMetodo = () -> saudar(horaValida);
        assertDoesNotThrow(chamadaValidaDeMetodo);
    }

}