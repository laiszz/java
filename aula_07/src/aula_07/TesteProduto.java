package aula_07;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoConsole console = new ProdutoConsole(1, "Xbox Series X", 3500.00f, 2023, 7.5f, "Microsoft");
		ProdutoJogo jogo = new ProdutoJogo(2, "Dead Space Remake", 250.00f, 2023, 9.5f, "EA Games");
		
		console.visualizar();
		System.out.println("\n");
		jogo.visualizar();

	}

}
