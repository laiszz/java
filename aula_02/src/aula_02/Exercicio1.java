package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite o primeiro número: ");
		A = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		B = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = entrada.nextInt();
		
		if ((A + B) > C) {
			System.out.println("A + B é maior que C");
		}
		else if ((A + B) == C) {
			System.out.println("A + B é igual que C");
		}
		else if ((A + B) < C) {
			System.out.println("A + B é menor que C");
		}
		
		entrada.close();

	}

}
