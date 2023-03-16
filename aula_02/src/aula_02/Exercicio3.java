package aula_02;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println("É sua primeira doação de sangue ('true' ou 'false'): ");
		primeiraDoacao = entrada.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && primeiraDoacao) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			}
			else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		}
		else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
		
		entrada.close();
		
	}
	
}
