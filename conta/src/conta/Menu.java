package conta;

import java.util.Scanner;
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

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Lais Sales", 1000.0f, 580.0f);
		cc1.visualizar();
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Marisa Sales", 1000.0f, 24);
		cp1.visualizar();
		
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
			
			opcao = entrada.nextInt();
			
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
	
		                    // criar o objeto conta corrente
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = entrada.nextInt();
	
		                    // criar o objeto conta poupanca
		                }
	                }
				}
				case 2 -> {
					System.out.println("Listar todas as contas\n\n");
				}
				case 3 -> {
					System.out.println("Buscar conta por número\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
				}
				case 4 -> {
					System.out.println("Atualizar dados da conta\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();

	                tipo = 1;
	                // condicional buscar na collection

	                System.out.println("Digite o Numero da Agência: ");
	                agencia = entrada.nextInt();
	                System.out.println("Digite o Nome do Titular: ");
	                entrada.skip("\\R?");
	                titular = entrada.nextLine();

	                System.out.println("Digite o Saldo da Conta (R$): ");
	                saldo = entrada.nextFloat();

	                // retornar tipo

	                switch (tipo) {
		                case 1 -> {
		                    System.out.println("Digite o Limite de Crédito (R$): ");
		                    limite = entrada.nextFloat();
	
		                    // criar o objeto conta corrente
		                }
		                case 2 -> {
		                    System.out.println("Digite o dia do Aniversario da Conta: ");
		                    aniversario = entrada.nextInt();
	
		                    // criar o objeto conta poupanca
	
		                }
		                default -> {
		                    System.out.println("Tipo de conta inválido!");
		                }
	                }

	                // fim do condicional buscar na collection
				}
				case 5 -> {
					System.out.println("Apagar conta\n\n"); 
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
				}
				case 6 -> {
					System.out.println("Sacar\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                System.out.println("Digite o valor do saque: ");
	                valor = entrada.nextFloat();
				}
				case 7 -> {
					System.out.println("Depositar\n\n");
					
					System.out.println("Digite o número da conta: ");
	                numero = entrada.nextInt();
	                
	                System.out.println("Digite o valor do depósito: ");
	                valor = entrada.nextFloat();
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
				}
				default -> {
					System.out.println("Opção Inválida!\n\n");
				}
			}
		}
	}

}
