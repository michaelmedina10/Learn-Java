package colecoes;

import java.util.HashSet;

public class ConjuntoBanguncado {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet<>();
		// adicionar
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add("X");
		conjunto.add(1);
		
		System.out.println(conjunto.size());
		// Não aceita repetição
		conjunto.add(1);
		System.out.println(conjunto.size());
		// removendo
		conjunto.remove(1);
		System.out.println(conjunto.size());
		conjunto.remove(1);
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains("x".toUpperCase()));
	}
}
