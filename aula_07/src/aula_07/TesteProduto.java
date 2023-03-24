package aula_07;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "Resident Evil 4 Remake", 250.00f, 2023, 10);
		Produto produto2 = new Produto(2, "Dead Space Remake", 250.00f, 2023, 9.5f);
		
		produto1.visualizar();
		System.out.println("\n");
		produto2.visualizar();

	}

}
