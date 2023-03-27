package aula_07;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioGerente funcionario1 = new FuncionarioGerente(1, "Lais Sales", "123456789",
				"Gerente", 3500.00f, 50000.0f);
		FuncionarioVendedor funcionario2 = new FuncionarioVendedor(2, "Marisa Sales", "123456789",
				"Vendedor", 4500.00f, 7000.0f);
		
		
		funcionario1.visualizar();
		System.out.println("\n");
		funcionario2.visualizar();

	}

}
