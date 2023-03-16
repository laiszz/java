package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte faixa;
		
		System.out.println("Faixas Etárias");
		System.out.println("1\tAté 10 anos");
		System.out.println("2\tDe 10 à 29 anos");
		System.out.println("3\tDe 29 à 45 anos");
		System.out.println("4\tDe 45 à 59 anos");
		System.out.println("5\tDe 59 à 65 anos");
		System.out.println("6\tAcima de 65 anos\n\n");
		
		System.out.println("Digite sua faixa etária: ");
		faixa = entrada.nextByte();
		
		switch(faixa) {
			case 1:
				System.out.println("Seu plano de saúde é R$100,00");
				break;
			case 2:
				System.out.println("Seu plano de saúde é R$200,00");
				break;
			case 3:
				System.out.println("Seu plano de saúde é R$300,00");
				break;
			case 4:
				System.out.println("Seu plano de saúde é R$500,00");
				break;
			case 5:
				System.out.println("Seu plano de saúde é R$600,00");
				break;
			case 6:
				System.out.println("Seu plano de saúde é R$1000,00");
				break;
			default:
				System.out.println("Idade inválida!");
				
		entrada.close();
				
		}
	}

}
