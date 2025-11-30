package com.teste_mutacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraDeDescontosTest {

    @Test
    public void testVipRecebe20Porcento() {
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        assertEquals(80.0, calc.calcular(100, TipoCliente.VIP), 0.01);
    }

    @Test
    public void testRegularRecebe10Porcento() {
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        assertEquals(90.0, calc.calcular(100, TipoCliente.REGULAR), 0.01);
    }

    @Test
    public void testNovoNaoRecebeDesconto() {
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        assertEquals(100.0, calc.calcular(100, TipoCliente.NOVO), 0.01);
    }
}
