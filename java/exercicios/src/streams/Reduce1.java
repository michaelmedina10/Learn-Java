package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
//		List<Integer> nums = new ArrayList<Integer>();
//		nums.add(10);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (cum, next) -> cum + next;
		int total = nums.stream()
						.filter(num -> num > 3)
			// Reduce é uma função terminadora não da para concaternar outro metodo depois
						.reduce(soma).get();
		System.out.println(total);
		
		/* 
		 * Se 'inicializar' o reduce ele retorna o valor direto ao invés de um OPTIONAL
		 * Sem necessidade de passar um GET()
		 * */ 
		int tota2 = nums.stream()
				.filter(num -> num > 3)
				.reduce(0, soma);
		System.out.println(tota2);

		System.out.println("\nUsando Método ifPresent para chamar alguma função\ncaso valor exista");
		nums.stream()
			.filter(num -> num > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
