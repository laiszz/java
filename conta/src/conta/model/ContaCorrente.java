package conta.model;

public class ContaCorrente extends Conta {
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		// Chamando os construtores da superclasse
		super(numero, agencia, tipo, titular, saldo);
		// Atributos adicionais
		this.limite = limite;
	}
	
	// GETs e SETs apenas dos atributos adicionais
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Sobrescrevendo os métodos da superclasse
	// (polimorfismo de sobrescrita)
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: " + this.getLimite());
	}
	
	@Override
	public boolean sacar (float valor) {
		if (this.getSaldo() + this.getLimite() <= valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	}
}
