package aula_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ingresso {
	private int codigo;
	private String nome_show;
	private LocalDate data;
	private int pista;
	private int tipo;
	
	public Ingresso(int codigo, String nome_show, LocalDate data, int pista, int tipo) {
		this.codigo = codigo;
		this.nome_show = nome_show;
		this.data = data;
		this.pista = pista;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_show() {
		return nome_show;
	}

	public void setNome_show(String nome_show) {
		this.nome_show = nome_show;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPista() {
		return pista;
	}

	public void setPista(int pista) {
		this.pista = pista;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome do show: " + this.getNome_show());
		System.out.println("Data: " + this.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		switch (this.getPista()) {
			case 1 -> {
				System.out.println("Pista: Arquibancada");
			}
			case 2 -> {
				System.out.println("Pista: Pista Central");
			}
			case 3 -> {
				System.out.println("Pista: Pista Esquerda");
			}
			case 4 -> {
				System.out.println("Pista: Pista Direita");
			}
		}
		
		switch (this.getTipo()) {
			case 1 -> {
				System.out.println("Tipo: Comum");
			}
			case 2 -> {
				System.out.println("Tipo: Meia-Entrada");
			}
			case 3 -> {
				System.out.println("Tipo: VIP");
			}
		}
	}
}
