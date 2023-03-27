package aula_07;

public class CursoLivre extends Curso {
	private boolean certificado;

	public CursoLivre(int codigo, String nome_curso, int tamanho_turma, int vagas, int duracao_semestres,
			boolean certificado) {
		super(codigo, nome_curso, tamanho_turma, vagas, duracao_semestres);
		this.certificado = certificado;
	}

	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Certificado ao finalizar: " + this.isCertificado());
	}
}
