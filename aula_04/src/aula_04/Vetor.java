package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetorInteiros[] = {1,4,2,6,8,3,7,9,5,10};
		int numero;
		
		float[] vetorFloat = new float[5];
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if (vetorInteiros[i] == numero) {
				System.out.println("Posição [" + i + "]: " + vetorInteiros[i]);
			}
		}
		
		for (int i = 0; i < vetorFloat.length; i++) {
			System.out.println("Digite um número para a posição [" + i + "]: ");
			vetorFloat[i] = entrada.nextFloat();
		}
		
		for (float j : vetorFloat) {
			System.out.println(j);
		}
		
		Arrays.sort(vetorInteiros);
		
		for (int k : vetorInteiros) {
			System.out.println(k);
		}
		
		entrada.close();
	}

}
