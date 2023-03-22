package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> arrayCores = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			arrayCores.add(entrada.nextLine());
		}
		
		System.out.println("Listando todas as cores: ");
		System.out.println(arrayCores);
		
		System.out.println("Ordenando as cores: ");
		arrayCores.sort(null);
		System.out.println(arrayCores);
		
		entrada.close();

	}

}
