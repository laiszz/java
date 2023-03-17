package aula_03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, idade21 = 0, idade50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = entrada.nextInt();
			
			if (idade < 21 && idade > 0) {
				idade21++;
			}
			if (idade > 50) {
				idade50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + idade21);
		System.out.println("Total de pessoas maiores de 50 anos: " + idade50);
		
		entrada.close();

	}

}
