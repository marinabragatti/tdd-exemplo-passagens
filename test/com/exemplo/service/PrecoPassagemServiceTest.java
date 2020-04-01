package com.exemplo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.exemplos.model.Passageiro;
import com.exemplos.model.TipoPassageiro;
import com.exemplos.model.Voo;

public class PrecoPassagemServiceTest {

	PrecoPassagemService precoPassagemService;
	
	@Before
	public void setUp() {
		precoPassagemService = new PrecoPassagemService();
	}
	
	@Test 
	public void deveCalcularPrecoParaPassageiroGoldComValorAbaixoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Joao", TipoPassageiro.GOLD);
		Voo voo = new Voo("Sao Paulo", "Rio de Janeiro", 100.0);		
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(90.0, valor, 0.00001);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroGoldComValorAcimaLimite() {
		Passageiro passageiro = new Passageiro("Joao", TipoPassageiro.GOLD);
		Voo voo = new Voo("Sao Paulo", "Rio de Janeiro", 600.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(510.0, valor, 0.00001);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroSilverComValorAbaixoLimite() {
		Passageiro passageiro = new Passageiro("Joao", TipoPassageiro.SILVER);
		Voo voo = new Voo("Sao Paulo", "Rio de Janeiro", 100.0);		
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(94.0, valor, 0.00001);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroSilverComValorAcimaLimite() {
		Passageiro passageiro = new Passageiro("Joao", TipoPassageiro.SILVER);
		Voo voo = new Voo("Sao Paulo", "Rio de Janeiro", 800.0);		
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(720.0, valor, 0.00001);
	}
}
