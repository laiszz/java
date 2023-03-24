package aula_07;

public class Produto {
	private int codigo;
	private String nome;
	private float preco;
	private int ano_lancamento;
	private float avaliacao;
	
	public Produto(int codigo, String nome, float preco, int ano_lancamento, float avaliacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.ano_lancamento = ano_lancamento;
		this.avaliacao = avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getAno_lancamento() {
		return ano_lancamento;
	}

	public void setAno_lancamento(int ano_lancamento) {
		this.ano_lancamento = ano_lancamento;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Preço: " + this.getPreco());
		System.out.println("Ano de Lançamento: " + this.getAno_lancamento());
		System.out.println("Avaliação: " + this.getAvaliacao());
	}
}
