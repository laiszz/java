package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaExercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Queue<String> filaBanco = new LinkedList<String>();
		byte opcao = 0;
		String nome;
		
		do {
			System.out.println("FILA DO BANCO\n");
			
			System.out.println("Opção\tFunção");
			System.out.println("1.\tAdicionar cliente na fila");
			System.out.println("2.\tListar todos os clientes da fila");
			System.out.println("3.\tRetirar clientes da fila");
			System.out.println("0.\tSair");
			
			System.out.println("\nEscolha uma opção: ");
			opcao = entrada.nextByte();
			
			switch (opcao) {
				case 1:
					System.out.println("\nDigite o nome do cliente: ");
					entrada.nextLine();
					nome = entrada.nextLine();
					
					filaBanco.add(nome);
					System.out.println("Cliente adicionado com sucesso!\n\n");
					
					break;
				
				case 2:
					if (filaBanco.isEmpty()) {
						System.out.println("A fila está vazia!");
					}
					else {
						System.out.println("\nClientes na fila: ");
						
						for (String elemento : filaBanco) {
							System.out.println(elemento);
						}
						
						System.out.println("\n");
					}
					
				
					break;
				
				case 3:
					if (filaBanco.isEmpty()) {
						System.out.println("A fila está vazia!");
					}
					else {
						filaBanco.poll();
						System.out.println("Cliente chamado com sucesso!\n\n");
					}
		
					break;
		
				default:
					if (opcao != 0) {
						System.out.println("Opção Inválida!");
					}
			}
			
		} while (opcao != 0);
		
		System.out.println("Programa finalizado!");
		
		entrada.close();

	}

}
