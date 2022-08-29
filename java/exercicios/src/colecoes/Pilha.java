package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O pequeno Principe");
		livros.push("Percy Jackson vol1");
		livros.push("Percy Jackson vol2");
		livros.push("Percy Jackson vol3");
		livros.push("Percy Jackson vol4");
		livros.push("Percy Jackson vol5");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.peek());
		System.out.println(livros.pop());
	}
}