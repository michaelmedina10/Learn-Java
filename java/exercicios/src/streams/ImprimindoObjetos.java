package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Mic", "Sim", "Min");
		
		System.out.println("\nLista com metodo forEach");
		aprovados.forEach((nome) -> System.out.println(nome));
		
		System.out.println("\nFor Tradicional");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		for (String nome: aprovados) {
			System.out.println("ForEach: " + nome);
		}
		
		System.out.println("\nUsando Iterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
