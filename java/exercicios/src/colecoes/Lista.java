package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Camila"));
		lista.add(new Usuario("Bia"));
		
		lista.remove(2);
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		// get pelo index da lista
		System.out.println(lista.get(3).nome);
	}
}
