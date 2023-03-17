package aula_03;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = entrada.nextInt();
		
		if (num2 > num1) {
			for(int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("Intervalo inválido!");
		}
		
		entrada.close();
	}

}
