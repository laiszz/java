package aula_07;

public class TesteCurso {

	public static void main(String[] args) {
		CursoLivre curso1 = new CursoLivre(1, "Física 0", 180, 176, 10, false);
		CursoEspecializacao curso2 = new CursoEspecializacao(2, "Contabilidade", 210, 207, 10, 1);
		
		curso1.visualizar();
		System.out.println("\n");
		curso2.visualizar();

	}

}
