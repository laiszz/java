package aula_07;

public class ProdutoConsole extends Produto {
	private String marca;

	public ProdutoConsole(int codigo, String nome, float preco, int ano_lancamento, float avaliacao, String marca) {
		super(codigo, nome, preco, ano_lancamento, avaliacao);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.getMarca());
	}
}
