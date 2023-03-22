package aula_05;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Brenda");
		fila.add("Guilherme");
		fila.add("Michelle");
		fila.add("Gabriel Lopes");
		fila.add("Katarina");
		
		for(var elemento : fila)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		fila.poll();
		System.out.println(fila);
		
		fila.add("Reynaldo");
		System.out.println(fila);
		
		System.out.println(fila.size());
		
		System.out.println(fila.contains("Reynaldo"));
	}

}