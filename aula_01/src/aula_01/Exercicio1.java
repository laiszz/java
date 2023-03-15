package aula_01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite seu salário: ");
		salario = entrada.nextFloat();
		System.out.println("Digite seu abono salarial: ");
		abono = entrada.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
		entrada.close();
		
	}

}
