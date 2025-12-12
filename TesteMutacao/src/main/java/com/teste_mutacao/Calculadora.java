package com.teste_mutacao;

public class Calculadora {
	
	public double min(double a, double b) {
		if (a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	public double soma(double a, double b) {
		return a + b;
	}
	
	public boolean isMaior(double a, double b) {
		return a > b;
	}
	
}