package aula_07;

public class CursoEspecializacao extends Curso {
	private int metodoEnsino;

	public CursoEspecializacao(int codigo, String nome_curso, int tamanho_turma, int vagas, int duracao_semestres,
			int metodoEnsino) {
		super(codigo, nome_curso, tamanho_turma, vagas, duracao_semestres);
		this.metodoEnsino = metodoEnsino;
	}

	public int getMetodoEnsino() {
		return metodoEnsino;
	}

	public void setMetodoEnsino(int metodoEnsino) {
		this.metodoEnsino = metodoEnsino;
	}
	
	public void visualizar() {
		super.visualizar();
		
		switch (this.getMetodoEnsino()) {
			case 1 -> {
				System.out.println("Método de Ensino: EAD");
			}
			case 2 -> {
				System.out.println("Método de Ensino: Presencial");
			}
		}
	}
}
