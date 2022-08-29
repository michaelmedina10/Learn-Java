package arrays;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = {9.5, 5.5, 4.6};
		for(double nota: notas) {
			System.out.printf("Nota: %.2f %n", nota);
		}
	}
}
