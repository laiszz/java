package aula_01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtra, descontos, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = entrada.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = entrada.nextFloat();
		System.out.println("Digite as horas extra: ");
		horasExtra = entrada.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = entrada.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtra * 5) - descontos;
		
		System.out.println("Seu salário líquido é: " + salarioLiquido);
		
		entrada.close();

	}

}