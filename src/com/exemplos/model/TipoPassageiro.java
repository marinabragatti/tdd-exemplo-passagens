package com.exemplos.model;

import com.exemplo.service.CalculadoraPrecoPassagem;
import com.exemplo.service.PrecoPassagemGold;
import com.exemplo.service.PrecoPassagemSilver;

public enum TipoPassageiro {

	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());
	
	CalculadoraPrecoPassagem calculadoraPrecoPassagem;
	
	TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem){
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}
	
	public CalculadoraPrecoPassagem getCalculadora() {
		return calculadoraPrecoPassagem;
	}
}
