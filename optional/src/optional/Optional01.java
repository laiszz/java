package optional;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {
		String[] palavras = new String[10];
		
		Optional<String> checkaNulo = Optional.ofNullable(palavras[5]);
		
		if (checkaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}
		else {
			System.out.println("A palavra é nula!");
		}
	}

}
