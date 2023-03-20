package aula_04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizInteiros = {{1,2,3}, {4,5,6}, {7,8,9}};
		float[][] matrizFloat = new float[2][3];
		
		for (int i = 0; i < matrizInteiros.length; i++) {
			for (int j = 0; j < matrizInteiros[i].length; j++) {
				System.out.println("Posição [" + i + "][" + j + "]: " + matrizInteiros[i][j]);
			}
		}
		
		for (int i = 0; i < matrizFloat.length; i++) {
			for (int j = 0; j < matrizFloat[i].length; j++) {
				System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
				matrizFloat[i][j] = entrada.nextFloat();
			}
		}
		
		for (int i = 0; i < matrizFloat.length; i++) {
			for (int j = 0; j < matrizFloat[i].length; j++) {
				System.out.println("Posição [" + i + "][" + j + "]: " + matrizFloat[i][j]);
			}
		}
			
		entrada.close();
	}

}
