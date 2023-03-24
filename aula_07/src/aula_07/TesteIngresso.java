package aula_07;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso(1, "Coldplay", "15/03/2023", "Arquibancada", "Meia");
		Ingresso ingresso2 = new Ingresso(2, "Coldplay", "15/03/2023", "Pista 1", "Inteira");
		
		ingresso1.visualizar();
		System.out.println("\n");
		ingresso2.visualizar();

	}

}
