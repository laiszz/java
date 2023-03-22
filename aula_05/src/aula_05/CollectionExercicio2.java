package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> arrayInteiros = new ArrayList<Integer>();
		int numero;
		
		for (int i = 0; i < 10; i++) {
			arrayInteiros.add(i*i);
		}
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = entrada.nextInt();
		
		if (arrayInteiros.contains(numero)) {
			System.err.println("O número " + numero + " está localizado na posição: " + arrayInteiros.indexOf(numero));
		}
		else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		entrada.close();

	}

}
