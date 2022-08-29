package fundamentos;
import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		final int temp = 32;
		final int numerador = 5;
		final int denominador = 9;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor em graus (Fahrenheit): ");
		double fahrenheit = ler.nextDouble();
		ler.close();
		double celsius = ((fahrenheit - temp) * numerador/(float) denominador);
		System.out.print("Temperatura em Celsius: " + celsius);
	}
}
