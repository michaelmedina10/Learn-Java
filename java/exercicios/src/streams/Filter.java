package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Filter {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		Aluno a1 = new Aluno("Mic", 8.0);
		Aluno a2 = new Aluno("Si", 9.0);
		Aluno a3 = new Aluno("Min", 10.0);
		Aluno a4 = new Aluno("Min2", 5.0);
		Aluno a5 = new Aluno("Min3", 4.4);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		alunos.stream()
			.filter(aluno -> aluno.nota > 5)
			.map(aluno -> "Parabén " + aluno.nome + " Você foi Aprovado!!!")
			.forEach(print);
		
	}
}
