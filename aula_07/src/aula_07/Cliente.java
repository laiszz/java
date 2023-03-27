package aula_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	// Atributos
	private String nome;
	private LocalDate data_nascimento;
	private String telefone;
	private String email;
	private String endereco;
	
	// Método Construtor
	public Cliente(String nome, LocalDate data_nascimento, String telefone, String email, String endereco) {
		this.nome = nome;
		this.data_nascimento = data_nascimento;
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

	public LocalDate getdata_nascimento() {
		return data_nascimento;
	}

	public void setdata_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
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
		System.out.println("Data de Nascimento: " + this.getdata_nascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Endereço: " + this.getEndereco());
	}
	
}
