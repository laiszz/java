package aula_07;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario(1, "Lais Sales", "123456789",
				"Desenvolvedora Junior", 3500.00f);
		Funcionario funcionario2 = new Funcionario(2, "Marisa Sales", "123456789",
				"Desenvolvedora Sênior", 4500.00f);
		
		
		funcionario1.visualizar();
		System.out.println("\n");
		funcionario2.visualizar();

	}

}
