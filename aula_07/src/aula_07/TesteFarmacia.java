package aula_07;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia farmacia1 = new Farmacia(1, "Hidratante", 49.90f, 15, "Beleza");
		Farmacia farmacia2 = new Farmacia(2, "Base Líquida", 44.90f, 100, "Maquiagem");
		
		farmacia1.visualizar();
		System.out.println("\n");
		farmacia2.visualizar();

	}

}
