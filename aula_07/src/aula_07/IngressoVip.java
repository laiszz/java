package aula_07;

import java.time.LocalDate;

public class IngressoVip extends Ingresso {
	private boolean incluiCamarote;

	public IngressoVip(int codigo, String nome_show, LocalDate data, int pista, int tipo, boolean incluiCamarote) {
		super(codigo, nome_show, data, pista, tipo);
		this.incluiCamarote = incluiCamarote;
	}

	public boolean isIncluiCamarote() {
		return incluiCamarote;
	}

	public void setIncluiCamarote(boolean incluiCamarote) {
		this.incluiCamarote = incluiCamarote;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Inclui camarote: " + this.isIncluiCamarote());
	}
}
