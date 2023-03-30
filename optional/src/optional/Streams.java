package optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numeros);
		
		// Fazendo números ao cubo em uma linha!
		List<Integer> numerosAoCubo = numeros.stream().map(n -> n*n*n).collect(Collectors.toList());
		System.out.println(numerosAoCubo);
		
		// Pegando só os números pares em uma linha!
		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(numerosPares);
		
		// Ordenando em ordem decrescente em uma linha!
		List<Integer> numerosDecrescentes = numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(numerosDecrescentes);
		
		// Contando quantos números pares têm na collection em uma linha!
		long contaPares = numeros.stream().filter(n -> n % 2 == 0).count();
		System.out.println(contaPares);
	}

}
