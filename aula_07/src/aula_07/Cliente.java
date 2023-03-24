package aula_07;

public class Cliente {
	// Atributos
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;
	
	// Método Construtor
	public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	// Métodos GETs e SETs
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	
	// Métodos que eu escrevi
	public void visualizar() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Endereço: " + this.getEndereco());
	}
	
}
