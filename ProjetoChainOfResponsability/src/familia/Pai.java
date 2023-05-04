package familia;
import permissao.Permissao;

public class Pai extends Permissao{

	public Pai(Permissao permissao) {
		super(permissao);
		// TODO Auto-generated constructor stub
	}
	
	public void saberPermissao() {
		System.out.println("Voce agora tem permissao");
	}
}
