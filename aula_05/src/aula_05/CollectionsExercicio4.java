package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsExercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Set<Integer> setInteiros = new HashSet<Integer>();
		int numero;
		
		for (int i = 0; i < 10; i++) {
			setInteiros.add(i*i);
		}
		
		System.out.println("Digite o número que deseja encontrar no Set: ");
		numero = entrada.nextInt();
		
		if (setInteiros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");
		}
		else{
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		entrada.close();

	}

}
