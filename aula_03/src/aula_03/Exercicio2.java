package aula_03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, pares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + (10 - pares));
		
		entrada.close();

	}

}
