package lambdas;

import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> umLista = () -> Arrays.asList("Paz", "Saúde", "Harmonia");
		System.out.println(umLista.get());
	}
}
