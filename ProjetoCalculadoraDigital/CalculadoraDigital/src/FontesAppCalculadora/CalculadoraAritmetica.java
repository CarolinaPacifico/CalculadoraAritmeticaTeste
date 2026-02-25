package FontesAppCalculadora;


public class CalculadoraAritmetica {

private static int resultadoConta;

public static int somar (int num1, int num2) {
	resultadoConta = num1 + num2;
	return resultadoConta;
}

public int subtrair (int num1, int num2) {
	resultadoConta = num1 - num2;
	return resultadoConta;
}

public int multiplicar (int num1, int num2) {
	resultadoConta = num1 * num2;
	return resultadoConta;
}

public int dividir (int num1, int num2) {
	resultadoConta = num1 / num2;
	return resultadoConta;
}
}
