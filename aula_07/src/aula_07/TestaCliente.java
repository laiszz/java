package aula_07;

import java.time.LocalDate;

public class TestaCliente {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(1998, 03, 24);
		LocalDate data2 = LocalDate.of(1972, 07, 05);
		
		ClientePessoaFisica cliente1 = new ClientePessoaFisica("Lais Sales", data1, "(12) 99999-9999",
				"email1@gmail.com", "Rua Tal, 123", "123.456.789-12");
		ClientePessoaJuridica cliente2 = new ClientePessoaJuridica("Marisa Sales", data2, "(12) 99999-9999",
				"email2@gmail.com", "Rua Tal, 123", "789.456.123-98");
		
		
		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
	}

}
