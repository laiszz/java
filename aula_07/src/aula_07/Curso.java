package aula_07;

public class Curso {
	private int codigo;
	private String nome_curso;
	private int tamanho_turma;
	private int vagas;
	private int duracao_semestres;
	
	public Curso(int codigo, String nome_curso, int tamanho_turma, int vagas, int duracao_semestres) {
		this.codigo = codigo;
		this.nome_curso = nome_curso;
		this.tamanho_turma = tamanho_turma;
		this.vagas = vagas;
		this.duracao_semestres = duracao_semestres;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public int getTamanho_turma() {
		return tamanho_turma;
	}

	public void setTamanho_turma(int tamanho_turma) {
		this.tamanho_turma = tamanho_turma;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public int getDuracao_semestres() {
		return duracao_semestres;
	}

	public void setDuracao_semestres(int duracao_semestres) {
		this.duracao_semestres = duracao_semestres;
	}
	
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome do curso: " + this.getNome_curso());
		System.out.println("Tamanho da turma: " + this.getTamanho_turma());
		System.out.println("Vagas disponíveis: " + this.getVagas());
		System.out.println("Duração do curso (semestres): " + this.getDuracao_semestres());
	}
}
