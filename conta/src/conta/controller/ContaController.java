package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A conta número " + conta.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void listarTodas() {
		for (var conta: listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.visualizar();
		}
		else {
			System.out.println("A conta não foi encontrada!");
		}
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("Os dados da conta " + buscaConta.getNumero() + " foram atualizados com sucesso!");
		}
		else {
			System.out.println("A conta não foi encontrada!");
		}	
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta)) {
				System.out.println("A conta foi excluída com sucesso!");
			}
			else {
				System.out.println("A exclusão da conta falhou!");
			}
		}
		else {
			System.out.println("A conta não foi encontrada!");
		}
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor)) {
				System.out.println("O saque foi efetuado com sucesso!");
			}
		}
		else {
			System.out.println("A conta não foi encontrada!");
		}
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("O depósito foi efetuado com sucesso!");
		}
		else {
			System.out.println("A conta não foi encontrada!");
		}
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor)) {
				contaDestino.depositar(valor);
				System.out.println("A transferência foi efetuada com sucesso!");
			}
		}
		else {
			System.out.println("As contas não foram encontradas!");
		}
	}
	
	// Métodos Auxiliares
	public int gerarNumero() {
		return ++numero;
	}
	
	public Conta buscarNaCollection(int numero) {
		for (var conta: listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}
	
	public int retornaTipo(int numero) {
		for (var conta: listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		
		return 0;
	}

}
