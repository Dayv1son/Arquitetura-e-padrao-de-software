package Principal;
import ItensParaComprar.*;
import Loja.Manequim;

public class Cliente {

	public static void main(String[] args) {
		Manequim m = new Manequim();
		Camiseta camiseta = new Camiseta(m);
		Bermuda bermuda = new Bermuda(camiseta);
		Tenis tenis = new Tenis(bermuda);
		Cordao cordao = new Cordao(tenis);
		Oculos oculos = new Oculos(cordao);
		
		oculos.comprarVestimenta();
		
	}

}
