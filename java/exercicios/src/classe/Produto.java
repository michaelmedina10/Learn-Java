package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;		
	}
	
	double precoComDesconto() {
		preco = this.preco * desconto;
		return preco;
	}
}
