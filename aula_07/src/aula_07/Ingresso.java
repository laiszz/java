package aula_07;

public class Ingresso {
	private int codigo;
	private String nome_show;
	private String data;
	private String pista;
	private String tipo;
	
	public Ingresso(int codigo, String nome_show, String data, String pista, String tipo) {
		this.codigo = codigo;
		this.nome_show = nome_show;
		this.data = data;
		this.pista = pista;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_show() {
		return nome_show;
	}

	public void setNome_show(String nome_show) {
		this.nome_show = nome_show;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPista() {
		return pista;
	}

	public void setPista(String pista) {
		this.pista = pista;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome do show: " + this.getNome_show());
		System.out.println("Data: " + this.getData());
		System.out.println("Pista: " + this.getPista());
		System.out.println("Tipo: " + this.getTipo());
	}
}
