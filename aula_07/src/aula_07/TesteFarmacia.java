package aula_07;

public class TesteFarmacia {

	public static void main(String[] args) {
		FarmaciaMedicamento remedio = new FarmaciaMedicamento(1, "Tolrest", 99.90f, 15, "Medicamentos", true);
		FarmaciaPerfumaria perfume = new FarmaciaPerfumaria(2, "Rosas", 44.90f, 10, "Perfumes", 2);
		
		remedio.visualizar();
		System.out.println("\n");
		perfume.visualizar();

	}

}
