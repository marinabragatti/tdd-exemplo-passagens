package com.exemplo.service;

import com.exemplos.model.Voo;

public class PrecoPassagemGold implements CalculadoraPrecoPassagem {

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreco() > 500)
			return calcularValorAcimaDoLimite(voo);
		return calcularValorAbaixoDoLimite(voo);
	}

	protected double calcularValorAbaixoDoLimite(Voo voo) {
		return voo.getPreco() * 0.9;
	}

	protected double calcularValorAcimaDoLimite(Voo voo) {
		return voo.getPreco() * 0.85;
	}
}
