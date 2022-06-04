import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Philips Fullstack");
		bootcamp.setDescricao("O bootcamp Philips Fullstack Developer é um programa gratuito para quem deseja iniciar a carreira em desenvolvimento e tecnologia da informação.");
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		
		Dev dev1 = new Dev();
		dev1.setNome("Walmir Silva");
		System.out.println(dev1.getNome()+" está inscrito em: " +dev1.getConteudosInscritos());
		dev1.inscreverBootcamp(bootcamp);
		
		Dev dev2 = new Dev();
		dev2.setNome("Sarah Luiza");
		dev2.inscreverBootcamp(bootcamp);
		
		System.out.println(dev1.getNome()+" está inscrito em: " +dev1.getConteudosInscritos());
		System.out.println(dev1.getNome()+" já concluiu: " +dev1.getConteudosConcluidos());
		System.out.println(dev2.getNome()+" está inscrito em: " +dev2.getConteudosInscritos());
		System.out.println(dev2.getNome()+" já concluiu: " +dev2.getConteudosConcluidos());
		
		dev1.progredir();
		dev1.progredir();
		dev2.progredir();
		
		System.out.println("----------------");
		
		System.out.println(dev1.getNome()+" está inscrito em: " +dev1.getConteudosInscritos());
		System.out.println(dev1.getNome()+" já concluiu: " +dev1.getConteudosConcluidos());
		System.out.println("XP "+dev1.getNome()+": "+dev1.calcularXp());
		System.out.println(dev2.getNome()+" está inscrito em: " +dev2.getConteudosInscritos());
		System.out.println(dev2.getNome()+" já concluiu: " +dev2.getConteudosConcluidos());
		System.out.println("XP "+dev2.getNome()+": "+dev2.calcularXp());
		
		
		
		
	}

}
