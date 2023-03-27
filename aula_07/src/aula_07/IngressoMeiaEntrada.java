package aula_07;

import java.time.LocalDate;

public class IngressoMeiaEntrada extends Ingresso {
	private boolean precisaCarteirinha;

	public IngressoMeiaEntrada(int codigo, String nome_show, LocalDate data, int pista, int tipo,
			boolean precisaCarteirinha) {
		super(codigo, nome_show, data, pista, tipo);
		this.precisaCarteirinha = precisaCarteirinha;
	}

	public boolean isPrecisaCarteirinha() {
		return precisaCarteirinha;
	}

	public void setPrecisaCarteirinha(boolean precisaCarteirinha) {
		this.precisaCarteirinha = precisaCarteirinha;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Precisa de carteirinha: " + this.isPrecisaCarteirinha());
	}
}
