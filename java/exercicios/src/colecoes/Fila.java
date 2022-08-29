package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Bia");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Tanjiro");
	}
}
