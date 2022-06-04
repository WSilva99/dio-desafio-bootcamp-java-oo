import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso de Java", "Lorem ipsum dolor amet et al.", 8);
		Curso curso2 = new Curso("Curso de Javascript", "Lorem ipsum dolor amet et al.", 4);
		Mentoria mentoria1 = new Mentoria("Introducao ao Curso de Java",
				"Aprenda a configurar o ambiente para o curso.", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp("Philips Fullstack",
				"O bootcamp Philips Fullstack Developer e um programa gratuito para quem deseja iniciar a carreira em desenvolvimento e tecnologia da informacao.");
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);

		Dev dev1 = new Dev("Walmir Silva");
		System.out.println(dev1.getNome() + " esta inscrito em: " + dev1.getConteudosInscritos());
		dev1.inscreverBootcamp(bootcamp);

		Dev dev2 = new Dev("Sarah Luiza");
		dev2.inscreverBootcamp(bootcamp);

		System.out.println(dev1.getNome() + " esta inscrito em: " + dev1.getConteudosInscritos());
		System.out.println(dev1.getNome() + " ja concluiu: " + dev1.getConteudosConcluidos());
		System.out.println(dev2.getNome() + " esta inscrito em: " + dev2.getConteudosInscritos());
		System.out.println(dev2.getNome() + " ja concluiu: " + dev2.getConteudosConcluidos());

		dev1.progredir();
		dev1.progredir();
		dev2.progredir();

		System.out.println("----------------");

		System.out.println(dev1.getNome() + " esta inscrito em: " + dev1.getConteudosInscritos());
		System.out.println(dev1.getNome() + " ja concluiu: " + dev1.getConteudosConcluidos());
		System.out.println("XP " + dev1.getNome() + ": " + dev1.calcularXp());
		System.out.println(dev2.getNome() + " esta inscrito em: " + dev2.getConteudosInscritos());
		System.out.println(dev2.getNome() + " ja concluiu: " + dev2.getConteudosConcluidos());
		System.out.println("XP " + dev2.getNome() + ": " + dev2.calcularXp());

	}

}
