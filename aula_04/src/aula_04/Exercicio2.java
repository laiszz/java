package aula_04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetorNumerosEntrada = new int[10];
		float soma = 0, media = 0;
		
		for (int i = 0; i < vetorNumerosEntrada.length; i++) {
			System.out.println("Digite o número da posição [" + i + "]: " );
			vetorNumerosEntrada[i] = entrada.nextInt();
		}
		
		System.out.println("Elementos pares: ");
		
		for (int i = 0; i < vetorNumerosEntrada.length; i++) {
			if (vetorNumerosEntrada[i] % 2 == 0) {
				System.out.println(vetorNumerosEntrada[i]);
			}
		}
		
		System.out.println("Elementos de índices ímpares: ");
		
		for (int i = 0; i < vetorNumerosEntrada.length; i++) {
			if (i % 2 != 0) {
				System.out.println(vetorNumerosEntrada[i]);
			}
		}
		
		for (int i = 0; i < vetorNumerosEntrada.length; i++) {
			soma += vetorNumerosEntrada[i];
		}
		
		media = soma / 10;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}
