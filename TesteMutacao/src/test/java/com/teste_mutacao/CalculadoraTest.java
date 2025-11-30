package com.teste_mutacao;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    private final Calculadora c = new Calculadora();

    @Test
    public void testMinDouble() {
        double resultado = c.min(3.5, 2.1);
        assertEquals(2.1, resultado, 0.0001);

        resultado = c.min(-1.0, -5.0);
        assertEquals(-5.0, resultado, 0.0001);

        resultado = c.min(7.0, 7.0);
        assertEquals(7.0, resultado, 0.0001);
    }

    @Test
    public void testSoma() {
        assertEquals(8, c.soma(3, 5), 0.0001);
        assertEquals(0, c.soma(-2, 2), 0.0001);
        assertEquals(-1, c.soma(-2, 1), 0.0001);
    }

    @Test
    public void testIsMaior() {
        assertTrue(c.isMaior(10, 5));   
        assertFalse(c.isMaior(5, 10));  
        assertFalse(c.isMaior(5, 5));  
    }
}
