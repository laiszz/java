package aula_07;

public class FarmaciaPerfumaria extends Farmacia {
	private int genero;

	public FarmaciaPerfumaria(int codigo, String nome, float preco, int quantidade, String setor, int genero) {
		super(codigo, nome, preco, quantidade, setor);
		this.genero = genero;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		super.visualizar();
		
		switch (this.getGenero()) {
			case 1 -> {
				System.out.println("Para o gênero: Masculino");
			}
			case 2 -> {
				System.out.println("Para o gênero: Feminino");
			}
			case 3 -> {
				System.out.println("Para o gênero: Neutro");
			}
		}
	}
}
