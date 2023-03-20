package aula_04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizNumerosEntrada = new int[3][3];
		float somaPrincipal = 0, somaSecundaria = 0;
		
		for (int i = 0; i < matrizNumerosEntrada.length; i++) {
			for (int j = 0; j < matrizNumerosEntrada[i].length; j++) {
				System.out.println("Digite o número da posição [" + i + "][" + j + "]: ");
				matrizNumerosEntrada[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Elementos da diagonal principal: ");
		
		for (int i = 0; i < matrizNumerosEntrada.length; i++) {
			for (int j = 0; j < matrizNumerosEntrada[i].length; j++) {
				if (i == j) {
					System.out.println(matrizNumerosEntrada[i][j]);
					
					somaPrincipal += matrizNumerosEntrada[i][j];
				}
			}
		}
		
		System.out.println("Elementos da diagonal secundária: ");
		
		for (int i = 0; i < matrizNumerosEntrada.length; i++) {
			for (int j = 0; j < matrizNumerosEntrada[i].length; j++) {
				if (i+j == 2) {
					System.out.println(matrizNumerosEntrada[i][j]);
					
					somaSecundaria += matrizNumerosEntrada[i][j];
				}
			}
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
		
		entrada.close();
	}

}
