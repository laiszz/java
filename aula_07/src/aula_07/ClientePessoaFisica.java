package aula_07;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {
	private String cpf;

	public ClientePessoaFisica(String nome, LocalDate aniversario, String telefone, String email, String endereco,
			String cpf) {
		super(nome, aniversario, telefone, email, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.getCpf());
	}
}
