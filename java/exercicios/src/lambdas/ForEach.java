package lambdas;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
//		ArrayList<String> aprovados = new ArrayList<>();
//		List<String> aprovados = new ArrayList<>();
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01 lista.forEach()");
		aprovados.forEach((nome) -> System.out.println(nome));
		
		System.out.println("\nMethod Reference");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02 lista.forEach()");
		aprovados.forEach((nome) -> meuImprimir(nome));
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
