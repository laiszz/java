package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
	public static void sobre(){
		System.out.println("                                                                      ");
		System.out.println("          Banco do Brazil com Z - O seu Futuro começa aqui!           ");
		System.out.println("                                                                      ");
		System.out.println("**********************************************************************");
		System.out.println("                                                                      ");
		System.out.println("             Lais Sales Xavier - lais.salesms@gmail.com               ");
		System.out.println("                     https://github.com/laiszz                        ");
		System.out.println("                                                                      ");
		System.out.println("**********************************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println("Pressione a tecla Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação!");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		ContaController contas = new ContaController();
		
		// Contas pré criadas para teste		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
        contas.cadastrar(cc1);

        ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
        contas.cadastrar(cc2);

        ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
        contas.cadastrar(cp1);

        ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
        contas.cadastrar(cp2);
		
		while (true) {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE_BOLD_BRIGHT);
			
			System.out.println("**********************************************************************");
			System.out.println("                                                                      ");
			System.out.println("                      BANCO DO BRAZIL COM Z                           ");
			System.out.println("                                                                      ");
			System.out.println("**********************************************************************");
			System.out.println("                                                                      ");
			System.out.println("                    1 - Criar conta                                   ");
			System.out.println("                    2 - Listar todas as contas                        ");
			System.out.println("                    3 - Buscar conta por número                       ");
			System.out.println("                    4 - Atualizar dados da conta                      ");
			System.out.println("                    5 - Apagar conta                                  ");
			System.out.println("                    6 - Sacar                                         ");
			System.out.println("                    7 - Depositar                                     ");
			System.out.println("                    8 - Transferir valores entre contas               ");
			System.out.println("                    9 - Sair                                          ");
			System.out.println("                                                                      ");
			System.out.println("**********************************************************************");
			System.out.println("                                                                      ");
			System.out.println("Entre com a opção desejada:                                           ");
			System.out.println("                                                                      ");
			
			System.out.println(Cores.TEXT_RESET);
			
			try {
				opcao = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				entrada.nextLine();
				opcao = 0;
			}
			
			if (opcao == 9) {
				sobre();
				
				entrada.close();
				System.exit(0);
			}
			
			switch (opcao) {
				case 1 -> {
					System.out.println("Criar Conta\n\n");
					
					System.out.println("Digite o Numero da Agência: ");
	                agencia = entrada.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                entrada.nextLine();
	                titular = entrada.nextLine();

	                do {
	                    System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
	                    tipo = entrada.nextInt();
	                } while (tipo < 1 && tipo > 2);

	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = entrada.nextFloat();

	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = entrada.nextFloat();
	
		                    contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = entrada.nextInt();
	
		                    contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		                }
	                }
	                keyPress();
	                
				}
				case 2 -> {
					System.out.println("Listar todas as contas\n\n");
					
					contas.listarTodas();
					
					keyPress();
				}
				case 3 -> {
					System.out.println("Buscar conta por número\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                contas.procurarPorNumero(numero);
	                
	                keyPress();
				}
				case 4 -> {
					System.out.println("Atualizar dados da conta\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                if (contas.buscarNaCollection(numero) != null){
	                    System.out.println("Digite o Numero da Agência: ");
		                agencia = entrada.nextInt();
		                System.out.println("Digite o Nome do Titular: ");
		                entrada.skip("\\R?");
		                titular = entrada.nextLine();

		                System.out.println("Digite o Saldo da Conta (R$): ");
		                saldo = entrada.nextFloat();

		                tipo = contas.retornaTipo(numero);

		                switch (tipo) {
			                case 1 -> {
			                    System.out.println("Digite o Limite de Crédito (R$): ");
			                    limite = entrada.nextFloat();
		
			                    contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
			                }
			                case 2 -> {
			                    System.out.println("Digite o dia do Aniversario da Conta: ");
			                    aniversario = entrada.nextInt();
		
			                    contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
		
			                }
			                default -> {
			                    System.out.println("Tipo de conta inválido!");
			                }
		                }
	                }
	                else {
	                	System.out.println("A conta não foi encontrada!");
	                }
	                
	                keyPress();
				}
				case 5 -> {
					System.out.println("Apagar conta\n\n"); 
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                contas.deletar(numero);
	                
	                keyPress();
				}
				case 6 -> {
					System.out.println("Sacar\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                System.out.println("Digite o valor do saque: ");
	                valor = entrada.nextFloat();
	                
	                contas.sacar(numero, valor);
	                
	                keyPress();
				}
				case 7 -> {
					System.out.println("Depositar\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                System.out.println("Digite o valor do depósito: ");
	                valor = entrada.nextFloat();
	                
	                contas.depositar(numero, valor);
	                
	                keyPress();
				}
				case 8 -> {
					System.out.println("Transferir valores entre contas\n\n");
					
					System.out.println("Digite o Numero da Conta de Origem: ");
	                numero = entrada.nextInt();
	                System.out.println("Digite o Numero da Conta de Destino: ");
	                numeroDestino = entrada.nextInt();

	                do {
	                    System.out.println("Digite o Valor da Transferência (R$): ");
	                    valor = entrada.nextFloat();
	                } while (valor <= 0);
	                
	                contas.transferir(numero, numeroDestino, valor);
	                
	                keyPress();
				}
				default -> {
					System.out.println("Opção Inválida!\n\n");
					
					keyPress();
				}
			}
		}
	}

}
