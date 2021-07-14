package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        Assertions.assertEquals(10, soma);

    }

    @Test
    public void deveriaSomarDoisNumerosNegativos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(-3, -5);
        Assertions.assertEquals(-8, soma);
    }
}
