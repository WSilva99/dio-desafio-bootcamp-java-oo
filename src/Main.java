import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Lorem ipsum dolor amet et al.");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Javascript");
		curso2.setDescricao("Lorem ipsum dolor amet et al.");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Introdução ao Curso de Java");
		mentoria1.setDescricao("Aprenda a configurar o ambiente para o curso.");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println(mentoria1.toString());
	}

}
