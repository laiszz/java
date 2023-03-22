package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		int opcao = 0;
		double nota;
		
		do {
			System.out.println("Opção\tFunção");
			
			System.out.println("1.\tCadastrar nota");
			System.out.println("2.\tListar todas as notas");
			System.out.println("3.\tBuscar uma nota");
			System.out.println("4.\tRemover nota");
			System.out.println("5.\tAtualizar uma nota");
			System.out.println("6.\tSair");
			
			System.out.println("\nEscolha uma opção: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Cadastrar nota");
					
					System.out.println("Digite uma nota: ");
					notas.add(entrada.nextDouble());
					
					System.out.println("Nota cadastrada!");
					
					break;
					
				case 2:
					System.out.println("Listar todas as notas");
					
					if (notas.isEmpty()) {
						System.out.println("Não existem notas cadastradas!");
					}
					else {
						for (Double elemento : notas) {
							System.out.println(elemento);
						}
					}
					
					break;
				
				case 3:
					System.out.println("Buscar uma nota");
					
					System.out.println("Digite uma nota: ");
					nota = entrada.nextDouble();
					
					if (notas.contains(nota)) {
						System.out.println("A nota está localizada na posição: " + notas.indexOf(nota));
					}
					else {
						System.out.println("A nota não foi encontrada!");
					}
					
					break;
				
				case 4:
					System.out.println("Remover nota");
					
					System.out.println("Digite uma nota: ");
					nota = entrada.nextDouble();
					
					if (notas.contains(nota)) {
						notas.remove(nota);
						System.out.println("Nota removida!");
					}
					else {
						System.out.println("A nota não existe!");
					}
					
					
					break;
				
				case 5:
					System.out.println("Atualizar uma nota");
					
					System.out.println("Digite a nota a ser alterada: ");
					nota = entrada.nextDouble();
					System.out.println("Digite a nova nota: ");
					Double novaNota = entrada.nextDouble();
					
					if (notas.contains(nota)) {
						notas.set(notas.indexOf(nota), novaNota);
						System.out.println("Nota Alterada!");
					}
					else {
						System.out.println("A nota não existe!");
					}
					
					break;
				
				default:
					if (opcao < 0 || opcao > 6) {
						System.out.println("Opção Inválida!");
					}
			}
		} while (opcao != 6);
		
		entrada.close();

	}

}
