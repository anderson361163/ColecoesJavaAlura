package br.com.alura.aula;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		System.out.println("---");
		aulas.remove(0);

		System.out.println(aulas);

		System.out.println("---");

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println("---");

		String primeiraAula = aulas.get(0);

		System.out.println("A primeira aula �: " + primeiraAula);

		System.out.println("---");

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println("---");

		// ELE � ACONSELHADO E MAIS RAPIDO
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		
		System.out.println("---");
		
		//o m�todo collections s� tem m�todo estatico
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println("---");
		
	}
}
