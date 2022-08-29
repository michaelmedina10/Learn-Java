package controle;

public class For {
	public static void main(String[] args) {
		String nome = "Michael";
		for (int c = 0; c < nome.length(); c++) {
			System.out.printf("Letra %d: %s ", c+1, nome.charAt(c));
		}
	}
}
