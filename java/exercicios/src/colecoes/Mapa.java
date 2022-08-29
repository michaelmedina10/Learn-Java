package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuario = new HashMap<Integer, String>();
		// Método Put, Insere ou sobreescreve
		usuario.put(1, "Roberto");
		usuario.put(2, "Ricardo");
		usuario.put(3, "Rebeca");
		System.out.println(usuario.size());
		System.out.println(usuario.keySet());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
	}
}
