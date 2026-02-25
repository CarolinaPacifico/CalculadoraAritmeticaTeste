package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	//Atributos de comparação de resultado
	private int resultadoReal;
	private int resultadoEsperado;
	
	//Testes de soma
	@Test
	public void testeSomar2com3() {
		resultadoEsperado = 5;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(2, 3);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testeSomar5com5() {
		resultadoEsperado = 10;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(5, 5);
		assertEquals(resultadoReal, resultadoEsperado);
	}

}
