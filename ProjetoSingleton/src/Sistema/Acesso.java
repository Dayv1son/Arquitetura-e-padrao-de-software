package Sistema;

public class Acesso {
	private static Acesso acesso;
	private static int count;
	
	//Construtor privado e vazio
	private Acesso() {
	}
	
	public static Acesso concederAcesso(Cliente c) {
		if(acesso == null) {
			count = c.getId();
			System.out.println("Usuario logado: "+c.getNome()+"\n");
			acesso = new Acesso();
		}
		if(count != c.getId()) {
			System.out.println("Acesso negado: "+c.getNome());
		}
		return acesso;
	}
}
