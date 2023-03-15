package aula_01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = entrada.nextFloat();
		System.out.println("Digite o quarto número: ");
		n4 = entrada.nextFloat();
		
		System.out.println("A diferença dos produtos é: " + ((n1 * n2) - (n3 * n4)));
		
		entrada.close();

	}

}