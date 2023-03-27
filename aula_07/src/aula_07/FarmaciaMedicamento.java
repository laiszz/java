package aula_07;

public class FarmaciaMedicamento extends Farmacia {
	private boolean precisaReceita;
	
	public FarmaciaMedicamento(int codigo, String nome, float preco, int quantidade, String setor,
			boolean precisaReceita) {
		super(codigo, nome, preco, quantidade, setor);
		this.precisaReceita = precisaReceita;
	}

	public boolean isPrecisaReceita() {
		return precisaReceita;
	}

	public void setPrecisaReceita(boolean precisaReceita) {
		this.precisaReceita = precisaReceita;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Precisa de receita: " + this.isPrecisaReceita());
	}
}
