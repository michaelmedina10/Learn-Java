package lambdas;

import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.getNome());
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		imprimir.accept(produto);
	}
}
