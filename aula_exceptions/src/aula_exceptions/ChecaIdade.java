package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		
	}

	public static void validarIdade(int idade){
		
		if(idade > 18) {
			System.out.println("A pessoa pode dirigir!");
		}
		else {
			throw new ArithmeticException("A pessoa não está apta a dirigir!");
		}
	
	}

}
