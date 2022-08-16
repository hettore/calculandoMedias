package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Por favor digite o nome do aluno: ");
		aluno.setName(sc.nextLine());
		System.out.println("Agora digite as 3 notas referentes ao 1º trimestre, 2º e 3º");
		System.out.println("1º Trimestre: ");
		aluno.setGrade1(sc.nextDouble());
		System.out.println("2º Trimestre: ");
		aluno.setGrade2(sc.nextDouble());
		System.out.println("3º Trimestre: ");
		aluno.setGrade3(sc.nextDouble());
		
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Pontos que faltaram %.2f pontos%n", aluno.pontosFaltantes());
		} else {
			System.out.println("PASSOU!");
		}
		
		sc.close();
	}

}
