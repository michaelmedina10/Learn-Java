package colecoes;

import java.util.HashSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		nomes.add("Carla");
		nomes.add("Suzana");
		nomes.add("Bia");
		for(String nome: nomes) {
			System.out.printf("Nome: %s \n", nome);
		}
	}
}
