package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
		System.out.println(media.apply(6.4, 8.0));
		
		// BiFunction tenho mais controle, tipos dos parametros e do retorno
//		BiFunction<T, U, R>
		BiFunction<Double, Double, String> status =
				(n1, n2) -> (n1 + n2)/2 >= 5? "Aprovado": "Reprovado";
		System.out.println(status.apply(5.5, 2.0));
	}
}
