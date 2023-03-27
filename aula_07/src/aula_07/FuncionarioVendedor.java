package aula_07;

import java.text.NumberFormat;

public class FuncionarioVendedor extends Funcionario {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	private float metaVendas;

	public FuncionarioVendedor(int codigo, String nome, String nis, String cargo, float salario, float metaVendas) {
		super(codigo, nome, nis, cargo, salario);
		this.metaVendas = metaVendas;
	}

	public float getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Meta de Vendas: " + nf.format(this.getMetaVendas()));
	}
}
