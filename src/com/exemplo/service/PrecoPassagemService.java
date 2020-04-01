package com.exemplo.service;

import com.exemplos.model.Passageiro;
import com.exemplos.model.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		
		return passageiro.getTipo().getCalculadora().calcular(voo);
	}

	
}
