package Sistema;

public class Principal {

	public static void main(String[] args) {
		Cliente cli_1 = new Cliente(1, "Breno", "Comum");
		Cliente cli_2 = new Cliente(2, "Fernanda", "Gerente");
		Cliente cli_3 = new Cliente(3, "Vander", "Coordenador");
		
		Acesso c1 = Acesso.concederAcesso(cli_1);
		Acesso c2 = Acesso.concederAcesso(cli_2);
		Acesso c3 = Acesso.concederAcesso(cli_3);
		
		
		

	}

}
