package aula_02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String subfilo, classe, ordem;
		
		System.out.println("Digite as informações SEM acentuação!\n");

		System.out.println("Digite o subfilo (Vertebrado ou Invertebrado): ");
		subfilo = entrada.nextLine();
		
		if (subfilo.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Digite a classe (Ave ou Mamifero): ");
			classe = entrada.nextLine();
			
			if (classe.equalsIgnoreCase("Ave")) {
				System.out.println("Digite a ordem (Carnivoro ou Onivoro): ");
				ordem = entrada.nextLine();
				
				if (ordem.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Seu animal é: Águia");
				}
				else if (ordem.equalsIgnoreCase("Onivoro")) {
					System.out.println("Seu animal é: Pomba");
				}
				else {
					System.out.println("Ordem inválida!");
				}
			}
			else if (classe.equalsIgnoreCase("Mamifero")) {
				System.out.println("Digite a ordem (Onivoro ou Herbivoro): ");
				ordem = entrada.nextLine();
				
				if (ordem.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Seu animal é: Vaca");
				}
				else if (ordem.equalsIgnoreCase("Onivoro")) {
					System.out.println("Seu animal é: Homem");
				}
				else {
					System.out.println("Ordem inválida!");
				}
			}
			else {
				System.out.println("Classe inválida!");
			}
		}
		else if (subfilo.equalsIgnoreCase("Invertebrado")) {
			System.out.println("Digite a classe (Inseto ou Anelideo): ");
			classe = entrada.nextLine();
			
			if (classe.equalsIgnoreCase("Inseto")) {
				System.out.println("Digite a ordem (Hematofago ou Herbivoro): ");
				ordem = entrada.nextLine();
				
				if (ordem.equalsIgnoreCase("Hematofago")) {
					System.out.println("Seu animal é: Pulga");
				}
				else if (ordem.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Seu animal é: Lagarta");
				}
				else {
					System.out.println("Ordem inválida!");
				}
			}
			else if (classe.equalsIgnoreCase("Anelideo")) {
				System.out.println("Digite a ordem (Hematofago ou Onivaro): ");
				ordem = entrada.nextLine();
				
				if (ordem.equalsIgnoreCase("Hematofago")) {
					System.out.println("Seu animal é: Sanguessuga");
				}
				else if (ordem.equalsIgnoreCase("Onivoro")) {
					System.out.println("Seu animal é: Minhoca");
				}
				else {
					System.out.println("Ordem inválida!");
				}
			}
			else {
				System.out.println("Classe inválida!");
			}
		}
		else {
			System.out.println("Subfilo inválido!");
		}	
		
		entrada.close();

	}

}
