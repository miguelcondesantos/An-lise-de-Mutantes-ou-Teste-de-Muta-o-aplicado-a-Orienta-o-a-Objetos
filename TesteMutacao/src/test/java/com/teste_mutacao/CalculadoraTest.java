package com.teste_mutacao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
	
	public Calculadora c = new Calculadora();
	
	@Test
	public void testMinDouble() {
	    assertEquals(3.0, c.min(3.0, 5.0), 0.0001);
	    assertEquals(5.0, c.min(5.0, 5.0), 0.0001);
	    assertEquals(-1.0, c.min(-1.0, 2.0), 0.0001);
	}

	
	@Test
	void testSoma() {
		assertEquals(8, c.soma(3, 5), 0.0001);
        assertEquals(0, c.soma(-2, 2), 0.0001);
        assertEquals(-1, c.soma(-2, 1), 0.0001);
	}
	
	@Test
	void testIsMaior() {
		assertTrue(c.isMaior(10, 5));
		assertTrue(c.isMaior(5, 10));
		assertTrue(c.isMaior(5, 5));
	}
}
