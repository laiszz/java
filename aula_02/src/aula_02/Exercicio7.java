package aula_02;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		byte codigo;
		float numero1, numero2;
		
		System.out.println("OPERAÇÕES\n");
		System.out.println("Código\tOperação");
		System.out.println("1\tSoma");
		System.out.println("2\tSubtração");
		System.out.println("3\tMultiplicação");
		System.out.println("4\tDivisão");
		
		System.out.println("\nDigite o primeiro número: ");
		numero1 = entrada.nextFloat();
		System.out.println("Digite o segundo número: ");
		numero2 = entrada.nextFloat();
		System.out.println("Digite o código da sua operação: ");
		codigo = entrada.nextByte();
		
		switch (codigo) {
			case 1:
				System.out.println("\n" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("\n" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("\n" + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
				break;
			case 4:
				System.out.println("\n" + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				break;
			default:
				System.out.println("Operação inválida!");
		}
		
		entrada.close();

	}

}
