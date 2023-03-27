package aula_07;

public class ProdutoJogo extends Produto {
	private String produtora;

	public ProdutoJogo(int codigo, String nome, float preco, int ano_lancamento, float avaliacao, String produtora) {
		super(codigo, nome, preco, ano_lancamento, avaliacao);
		this.produtora = produtora;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtora: " + this.getProdutora());
	}
}
