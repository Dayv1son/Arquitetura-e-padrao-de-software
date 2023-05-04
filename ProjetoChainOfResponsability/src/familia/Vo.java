package familia;
import permissao.Permissao;

public class Vo extends Permissao {

	public Vo(Permissao permissao) {
		super(permissao);
		// TODO Auto-generated constructor stub
	}
	
	public void saberPermissao() {
		System.out.println("Contatar o pai ou a mae para saber sobre a devida permissao");
	}
}
