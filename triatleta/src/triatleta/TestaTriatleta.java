package triatleta;

public class TestaTriatleta {

	public static void main(String[] args) {
		PessoaTriatleta tt1 = new PessoaTriatleta("Joyce");
		
		tt1.aquecer();
		tt1.correr();
		tt1.nadar();
		tt1.pedalar();
		tt1.cansar();
	}

}
