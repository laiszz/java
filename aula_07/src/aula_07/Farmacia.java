package aula_07;

import java.text.NumberFormat;

public class Farmacia {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	private int codigo;
	private String nome;
	private float preco;
	private int quantidade;
	private String setor;
	
	public Farmacia(int codigo, String nome, float preco, int quantidade, String setor) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.setor = setor;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Preço: " + nf.format(this.getPreco()));
		System.out.println("Quantidade: " + this.getQuantidade());
		System.out.println("Setor: " + this.getSetor());
	}
}
