package aula_07;

import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente {
	private String cnpj;

	public ClientePessoaJuridica(String nome, LocalDate aniversario, String telefone, String email, String endereco,
			String cnpj) {
		super(nome, aniversario, telefone, email, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.getCnpj());
	}
}
