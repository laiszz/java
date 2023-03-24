package aula_07;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso1 = new Curso(1, "Física", 180, 176, 10);
		Curso curso2 = new Curso(2, "Química", 210, 207, 10);
		
		curso1.visualizar();
		System.out.println("\n");
		curso2.visualizar();

	}

}
