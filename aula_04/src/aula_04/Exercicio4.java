package aula_04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[][] matrizNotasAlunos = new float[10][4];
		float[] vetorMedias = new float[10];
		float soma = 0, media = 0;
		
		// Entrada de dados
		for (int i = 0; i < matrizNotasAlunos.length; i++) {
			System.out.println("\nAluno " + (i + 1));
			
			for (int j = 0; j < matrizNotasAlunos[i].length; j++) {
				System.out.println("Digite a nota do " + (j + 1) + "° Semestre: ");
				matrizNotasAlunos[i][j] = entrada.nextFloat();
			}
		}
		
		// Calculando as médias
		for (int i = 0; i < matrizNotasAlunos.length; i++) {	
			// Resetando as variáveis para um aluno não interferir no outro
			soma = 0;
			media = 0;
			
			for (int j = 0; j < matrizNotasAlunos[i].length; j++) {
				soma += matrizNotasAlunos[i][j];
			}
			
			media = soma / 4;
			
			// Adicionando a média no vetor de médias
			vetorMedias[i] = media;
		}
		
		System.out.println("\n\nMédias: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Aluno " + i + ": " + vetorMedias[i]);
		}
		
		entrada.close();

	}

}
