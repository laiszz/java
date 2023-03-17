package aula_03;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int i = 1;
		
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		
		while (i <= 10) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
		entrada.close();

	}

}
