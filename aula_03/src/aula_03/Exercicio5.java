package aula_03;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextByte();
			
			if (numero >= 0) {
				soma += numero;
			}
		}while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		entrada.close();

	}

}
