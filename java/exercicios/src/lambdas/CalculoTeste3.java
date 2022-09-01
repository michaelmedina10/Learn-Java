package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Não Permiti int -> Double
		// Permit double -> Double
		
		BinaryOperator<Double> calculo = (x, y) ->{ return x + y;};
		System.out.println(calculo.apply(2.0, 5.0));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(2.0, 5.0));
		
	}
}
