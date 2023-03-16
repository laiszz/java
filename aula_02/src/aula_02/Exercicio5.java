package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Scanner entrada = new Scanner(System.in);
		byte codigo;
		int quantidade;
		float preco;
		
		System.out.println("CARDÁPIO\n");
		System.out.println("Código\tProduto");
		System.out.println("1\tCachorro Quente");
		System.out.println("2\tX-Salada");
		System.out.println("3\tX-Bacon");
		System.out.println("4\tBauru");
		System.out.println("5\tRefrigerante");
		System.out.println("6\tSuco de Laranja\n\n");
		
		System.out.println("Digite o código do produto que deseja: ");
		codigo = entrada.nextByte();
		System.out.println("Digite a quantidade que deseja: ");
		quantidade = entrada.nextInt();
		
		switch (codigo) {
			case 1:
				preco = 10 * quantidade;
				System.out.println("\nProduto escolhido: Cachorro Quente");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			case 2:
				preco = 15 * quantidade;
				System.out.println("\nProduto escolhido: X-Salada");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			case 3:
				preco = 18 * quantidade;
				System.out.println("\nProduto escolhido: X-Bacon");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			case 4:
				preco = 12 * quantidade;
				System.out.println("\nProduto escolhido: Bauru");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			case 5:
				preco = 8 * quantidade;
				System.out.println("\nProduto escolhido: Refrigerante");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			case 6:
				preco = 13 * quantidade;
				System.out.println("\nProduto escolhido: Suco de Laranja");
				System.out.println("Valor Total: " + nf.format(preco));
				break;
			default:
				System.out.println("Código inválido!");
		}
		
		entrada.close();
		
	}

}
