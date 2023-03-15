package aula_01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é: " + media);
		
		entrada.close();

	}

}