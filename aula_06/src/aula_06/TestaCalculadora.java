package aula_06;

import java.util.Scanner;
import aula_06.calculos.Calculos;

public class TestaCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculos operacoes = new Calculos();
		double numero1 = 0, numero2 = 0;
		byte opcao;
		
		while(true) {
			System.out.println("1.\tSoma");
			System.out.println("2.\tSubtração");
			System.out.println("3.\tMultiplicação");
			System.out.println("4.\tDivisão");
			System.out.println("0.\tSair");
			
			System.err.println("Selecione uma opção: ");
			opcao = entrada.nextByte();
			
			if (opcao == 0) {
				sobre();
				entrada.close();
				System.exit(0);
			}
			
			System.err.println("Digite o 1o número: ");
			numero1 = entrada.nextDouble();
			
			System.err.println("Digite o 2o número: ");
			numero2 = entrada.nextDouble();
			
			switch (opcao) {
				case 1 -> {
					System.out.println("Soma: " + operacoes.soma(numero1, numero2));
				}
				case 2 -> {
					System.out.println("Subtração: " + operacoes.subtracao(numero1, numero2));
				}
				case 3 -> {
					System.out.println("Multiplicação: " + operacoes.multiplicacao(numero1, numero2));
				}
				case 4 -> {
					System.out.println("Divisão: " + operacoes.divisao(numero1, numero2));
				}
				default -> {
					System.out.println("Opção Inválida: ");
				}
				
			}
		}

	}
	
	public static void sobre () {
		System.out.println("Calculadora com métodos");
		System.out.println("Lais Sales Xavier");
	}

}
