package aula_07;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Lais Sales", "999.999.999-99", "(12) 99999-9999",
				"email1@gmail.com", "Rua Tal, 123");
		Cliente cliente2 = new Cliente("Marisa Sales", "123.456.789-10", "(12) 99999-9999",
				"email2@gmail.com", "Rua Tal, 123");
		
		
		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
	}

}
