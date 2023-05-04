package principal;
import familia.Filho;
import familia.Irmao;
import familia.Pai;
import familia.Vo;

public class Principal {

	public static void main(String[] args) {
		Filho f = new Filho(null);
		
		Pai p = new Pai(f);
		Irmao i = new Irmao(f);
		Vo v = new Vo(f);
		
		p.saberPermissao();
		i.saberPermissao();
		v.saberPermissao();
	}

}
