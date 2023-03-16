package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Scanner entrada = new Scanner(System.in);
		byte codigo;
		float saldo = 1000f;
		float saque, deposito;
		
		System.out.println("BANCO\n");
		System.out.println("Código\tOperação");
		System.out.println("1\tSaldo");
		System.out.println("2\tSaque");
		System.out.println("3\tDepósito");
		
		System.out.println("\nDigite o código da sua operação: ");
		codigo = entrada.nextByte();
		
		switch (codigo) {
			case 1:
				System.out.println("\nOperação: Saldo\nSaldo: " + nf.format(saldo));
				break;
			case 2:
				System.out.println("\nDigite o valor a ser sacado: ");
				saque = entrada.nextFloat();
				
				if (saque > saldo) {
					System.out.println("\nOperação: Saque\nSaldo Insuficiente!");
				}
				else {
					System.out.println("\nOperação: Saque\nSaldo: " + nf.format(saldo - saque));
				}
				break;
			case 3:
				System.out.println("\nDigite o valor a ser depositado: ");
				deposito = entrada.nextFloat();
				
				System.out.println("\nOperação: Deposito\nSaldo: " + nf.format(saldo + deposito));				
				break;
			default:
				System.out.println("Operação inválida!");
		}
		
		entrada.close();

	}

}
