package com.teste_mutacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	public Calculadora c = new Calculadora();
	
	@Test
	void testMin() {
		assertEquals(3, c.min(3, 5));
        assertEquals(5, c.min(5, 5));
        assertEquals(-1, c.min(-1, 2));
	}
	
	@Test
	void testSoma() {
		assertEquals(8, c.soma(3, 5));
        assertEquals(0, c.soma(-2, 2));
        assertEquals(-1, c.soma(-2, 1));
	}
	
	@Test
	void testIsMaior() {
		assertTrue(c.isMaior(10, 5));
		assertTrue(c.isMaior(5, 10));
		assertTrue(c.isMaior(5, 5));
	}
}
