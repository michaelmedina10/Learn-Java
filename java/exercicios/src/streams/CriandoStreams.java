package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		// interface que recebe algo mas não retorna nada
		Consumer<String> print = System.out::println;
		
		// Criando um Stream
		Stream<String> langs = Stream.of("Java ", "Python ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Lua", "Lisp", "Perl", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		// Escolhendo indice que será exibido, no caso o dois é exclusivo
		// indice 1 e 2
		Arrays.stream(maisLangs, 1, 2).forEach(print);
	
		List<String> outrasLangs = Arrays.asList("PHP", "Flutter", "C++");
		outrasLangs.stream().forEach(print);
		System.out.println("\nStream Parallel");
		outrasLangs.parallelStream().forEach(print);
	}
}
