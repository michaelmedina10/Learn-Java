package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos Alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por Aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notas = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.printf("Informa a nota %d do Aluno %d: ", j + 1, i + 1);
				notas[i][j] = entrada.nextDouble();
				total += notas[i][j];
			}
		}
		double media = total/ (qtdeAlunos * qtdeNotas);
		System.out.printf("Média geral de todos alunos é: %.2f", media);
		entrada.close();
	}
}
