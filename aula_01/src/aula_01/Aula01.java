package aula_01;

// Importando os arquivos necessários
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// Definindo uma máscara de formatação pro resultado
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		// Criando um scanner novo, para se poder ler o input do usuário
		Scanner leia = new Scanner(System.in);
		
		// Definindo as variáveis
		double numero1, numero2;
		String nome;
		
		// Usando o scanner para guardar os inputs do usuário
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		// Fazendo as operações matemáticas, formatando os resultados, e mostrando
		// na tela
		System.out.println("Seu nome é: " + nome);
		System.out.println("Soma: " + df.format(numero1 + numero2));
		System.out.println("Subtração: " + df.format(numero1 - numero2));
		System.out.println("Multiplicação: " + df.format(numero1 * numero2));
		System.out.println("Divisão: " + df.format(numero1 / numero2));
		System.out.println("Potência: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("Raíz Quadrada: " + df.format(Math.sqrt(numero1)));
	}

}
