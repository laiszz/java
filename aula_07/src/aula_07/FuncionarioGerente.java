package aula_07;

import java.text.NumberFormat;

public class FuncionarioGerente extends Funcionario {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	private float metaAgencia;

	public FuncionarioGerente(int codigo, String nome, String nis, String cargo, float salario, float metaAgencia) {
		super(codigo, nome, nis, cargo, salario);
		this.metaAgencia = metaAgencia;
	}

	public float getMetaAgencia() {
		return metaAgencia;
	}

	public void setMetaAgencia(float metaAgencia) {
		this.metaAgencia = metaAgencia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Meta da Agência: " + nf.format(this.getMetaAgencia()));
	}
}
