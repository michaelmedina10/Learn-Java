package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		// Printando Array
		System.out.println(Arrays.toString(notasAlunoA));
		
		for (int c = 0; c < notasAlunoA.length; c++) {
			System.out.print(notasAlunoA[c]);
		}
		
		// iniciando vetor ja com valores
		double[] notasAlunoB = {6.9, 7.5, 8.5};
		for(int i = 0; i < notasAlunoB.length; i++) {
			System.out.print(notasAlunoB[i]);
		}
	}
}
