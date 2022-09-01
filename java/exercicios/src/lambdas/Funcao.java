package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0? "Par":"Impar";

		Function<String, String> oResultadoE =
				valor -> "O Resultado é " + valor;
			
		System.out.println(parOuImpar.apply(11));
		
		// Concatenando Interfaces
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
		System.out.println(resultadoFinal);
	}
}
