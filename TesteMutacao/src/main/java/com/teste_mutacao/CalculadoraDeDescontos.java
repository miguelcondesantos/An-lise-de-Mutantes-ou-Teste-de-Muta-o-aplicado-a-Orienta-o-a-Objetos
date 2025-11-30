package com.teste_mutacao;

public class CalculadoraDeDescontos {
	
	public double calcular(double valor, TipoCliente tipo) {
		if (tipo == TipoCliente.VIP) {
			return valor * 0.80;
		}else if (tipo == TipoCliente.REGULAR) {
			return valor * 0.90;
			
		}else {
			return valor;
		}
	}
	
}
