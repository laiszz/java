package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Scanner entrada = new Scanner(System.in);
		byte codigo;
		float salario, novoSalario;
		String nome;
		
		System.out.println("REAJUSTE DE SALÁRIOS\n");
		System.out.println("Código\tCargo\tPercentual do Reajuste");
		System.out.println("1\tGerente\t\t10%");
		System.out.println("2\tVendedor\t7%");
		System.out.println("3\tSupervisor\t9%");
		System.out.println("4\tMotorista\t6%");
		System.out.println("5\tEstoquista\t5%");
		System.out.println("6\tTécnico de TI\t8%\n\n");
		
		System.out.println("Digite o seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite o código do seu cargo: ");
		codigo = entrada.nextByte();
		System.out.println("Digite o seu salário atual: ");
		salario = entrada.nextFloat();
		
		switch (codigo) {
			case 1:
				novoSalario = salario * 1.1f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			case 2:
				novoSalario = salario * 1.07f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			case 3:
				novoSalario = salario * 1.09f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			case 4:
				novoSalario = salario * 1.06f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			case 5:
				novoSalario = salario * 1.05f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			case 6:
				novoSalario = salario * 1.08f;
				System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
				break;
			default:
				System.out.println("Código inválido!");
		}
		
		entrada.close();

	}

}
