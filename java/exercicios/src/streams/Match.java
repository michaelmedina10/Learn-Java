package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Mic", 8.0);
		Aluno a2 = new Aluno("Si", 9.0);
		Aluno a3 = new Aluno("Min", 10.0);
		Aluno a4 = new Aluno("Min2", 5.0);
		Aluno a5 = new Aluno("Min3", 4.4);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Predicate<Aluno> aprovado = aluno -> aluno.nota >=7;
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
	}
}
