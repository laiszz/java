package aula_07;

import java.time.LocalDate;

public class TesteIngresso {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(2023, 03, 15);
		LocalDate data2 = LocalDate.of(2023, 03, 26);
		
		IngressoVip ingresso1 = new IngressoVip(1, "Coldplay", data1, 1, 3, true);
		IngressoMeiaEntrada ingresso2 = new IngressoMeiaEntrada(2, "Twenty One Pilots", data2, 2, 2, false);
		
		ingresso1.visualizar();
		System.out.println("\n");
		ingresso2.visualizar();

	}

}
