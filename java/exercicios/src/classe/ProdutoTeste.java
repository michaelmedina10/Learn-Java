package classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		Produto p2 = new Produto("Caneta Preta", 12.56);

		p1.preco = p1.precoComDesconto();
		p2.preco = p2.precoComDesconto();
		System.out.printf("%s: %.2f \n", p1.nome, p1.preco);
		System.out.printf("%s: %.2f \n", p2.nome, p2.preco);
	}
}
