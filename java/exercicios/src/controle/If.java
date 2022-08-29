package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		if (media >= 7) {
			System.out.print("Aprovado!");
		} if (media >= 5 && media < 7) {
			System.out.print("Recupeação!");
		} else {
			System.out.print("Reprovado!");
		}
		entrada.close(); 
	}
}
