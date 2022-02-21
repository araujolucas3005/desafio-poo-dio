package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescricao("Bootcamp Java");
		
		Curso cursoDeJava = new Curso();
		cursoDeJava.setTitulo("Aprendendo Java na raça.");
		cursoDeJava.setDescricao("Aprenda orientação a objetos com Java!");
		cursoDeJava.setCargaHoraria(20);
		
		Mentoria mentoriaJava = new Mentoria();
		mentoriaJava.setTitulo("Mentoria de Java");
		mentoriaJava.setDescricao("Mentoria de Java na raça");
		mentoriaJava.setData(LocalDate.now());
		
		Dev lucasDev = new Dev();
		lucasDev.setNome("Lucas");
		
		lucasDev.getConteudosInscritos().add(mentoriaJava);
		lucasDev.getConteudosInscritos().add(cursoDeJava);
		
		bootcamp.getConteudos().add(cursoDeJava);
		bootcamp.getConteudos().add(mentoriaJava);
		
		printSeparator(10);
		System.out.println("Conteudos inscritos: " + lucasDev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + lucasDev.getConteudosConcluidos());
		System.out.println("Experiência total: " + lucasDev.calcularXp());
		
		printSeparator(10);
		lucasDev.progredir();

		System.out.println(lucasDev.getConteudosInscritos());
		System.out.println("Conteudos inscritos: " + lucasDev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + lucasDev.getConteudosConcluidos());
		System.out.println("Experiência total: " + lucasDev.calcularXp());
		
		printSeparator(10);
		lucasDev.progredir();

		System.out.println("Conteudos inscritos: " + lucasDev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + lucasDev.getConteudosConcluidos());
		System.out.println("Experiência total: " + lucasDev.calcularXp());
		
		printSeparator(10);
		lucasDev.progredir();

		System.out.println("Conteudos inscritos: " + lucasDev.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + lucasDev.getConteudosConcluidos());
		System.out.println("Experiência total: " + lucasDev.calcularXp());
		
		printSeparator(10);

	}
	
	private static void printSeparator(int number) {
		System.out.println("-".repeat(number));
	}

}
