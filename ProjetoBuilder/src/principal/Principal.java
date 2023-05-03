package principal;
import cadastro.Cadastro;
import cadastro.CadastroBuilder;

public class Principal {

	public static void main(String[] args) {
		Cadastro c1 = new CadastroBuilder()
				.setCadastro("Julio", "Almeida Ferreira", 27, "JulioAF@gmail.com", 
				"Rio de Janeiro, capital", "111.111.111-11").builder();
		
		Cadastro c2 = new CadastroBuilder()
				.setCadastro("Natalia", "Maia Monteiro", 23, "NataliaMM@gmail.com", 
				"Rio de Janeiro, Leblon", "222.222.222-22").builder();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
