package aula_07;

public class Funcionario {
	// Atributos
	private int codigo;
	private String nome;
	private String nis;
	private String cargo;
	private float salario;
	
	// Método Construtor
	public Funcionario(int codigo, String nome, String nis, String cargo, float salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.nis = nis;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	// Métodos GETs e SETs
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// Métodos que eu escrevi
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("NIS: " + this.getNis());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Salário: " + this.getSalario());
	}
	
}
