package aula_04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetorInteiros[] = {1,4,2,6,8,3,7,9,5,10};
		int numero;
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = entrada.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if (vetorInteiros[i] == numero) {
				System.out.println("O número " + numero + " está na posição: " + i);
			}
		}
		
		entrada.close();
	}

}
