package conta.model;

public abstract class Conta {
	// Atributos
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Método Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Método Construtor nulo (polimorfismo de sobrecarga)
	public Conta() {}
	
	// Sets e Gets
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	// Métodos que eu fiz
	public boolean sacar (float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	}
	
	public void deposito (float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void visualizar() {
		// Associando ao atributo this.tipo um texto informando o que significa cada valor
		String tipo = "";
		
		switch (this.getTipo()) {
			case 1 -> {
				tipo = "Conta-Corrente";
			}
			case 2 -> {
				tipo = "Conta-Poupança";
			}
		}
		
		// Imprimindo as informações da conta
		System.out.println("**********************************************************************");
		System.out.println("                                                                      ");
		System.out.println("                           DADOS DA CONTA                             ");
		System.out.println("                                                                      ");
		System.out.println("**********************************************************************");
		System.out.println("                                                                      ");
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Agência da conta: " + this.getAgencia());
		System.out.println("Tipo da conta: " + tipo);
		System.out.println("Nome do titular da conta: " + this.getTitular());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}
