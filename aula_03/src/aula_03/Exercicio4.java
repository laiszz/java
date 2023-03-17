package aula_03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte idade, sexo, categoria;
		int pessoasBackend = 0, mulheresFrontend = 0, homensMobile40 = 0, mulheresFullstack30 = 0;
		char continua = 'S';
		
		while(continua == 'S') {	
			System.out.println("Digite sua idade: ");
			idade = entrada.nextByte();
			System.out.println("Digite seu sexo (1-M, 2-F, 3-Outros): ");
			sexo = entrada.nextByte();
			System.out.println("Digite sua categoria (1-Backend, 2-Frontend, 3-Mobile, 4-Fullstack): ");
			categoria = entrada.nextByte();
			
			if (categoria == 1) {
				pessoasBackend++;
			}
			if (sexo == 2 && categoria == 2) {
				mulheresFrontend++;
			}
			if (idade > 40 && sexo == 1 && categoria == 3) {
				homensMobile40++;
			}
			if (idade < 30 && sexo == 2 && categoria == 4) {
				mulheresFullstack30++;
			}
			
			System.out.println("Deseja cadastras as informações de um novo colaborador? (S/N): ");
			continua = entrada.next().toUpperCase().charAt(0);
		}
		
		System.out.println("\nNúmero de pessoas desenvolvedoras Backend: " + pessoasBackend);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + mulheresFrontend);
		System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
		System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullstack30);
		
		entrada.close();

	}

}
