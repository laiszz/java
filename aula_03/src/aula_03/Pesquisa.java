package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade, sexo, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			do {
				System.out.println("Digite seu gênero (1-M, 2-F, 3-Outros: ");
				sexo = entrada.nextInt();
			}while(sexo < 1 || sexo > 3);
			
			System.out.println("Digite seu esporte favorito (1-Futebol, 2-Vôlei, 3-Basquete, 4-Games): ");
			esporte = entrada.nextInt();
			
			System.out.println("\nDeseja continuar (S/N): ");
			continua = entrada.next().toUpperCase().charAt(0);
			
			if (sexo == 2 && esporte == 1) {
				futebolFeminino++;
			}
			if (idade >= 18 && esporte == 2) {
				maiores18Volei++;
			}
			
			contador++;
			
		}
		
		System.out.println("Total de fichas preenchidas: " + contador);
		System.out.println("Total de mulheres que jogam futebol: " + futebolFeminino);
		System.out.println("Total de maiores de 18 que jogam vôlei: " + maiores18Volei);
		
		entrada.close();

	}

}
