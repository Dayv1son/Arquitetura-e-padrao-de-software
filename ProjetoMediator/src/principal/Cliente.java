package principal;
import restaurante.Cozinheiro;
import restaurante.Garcom;

public class Cliente {
	public static void main(String[] args) {
		Garcom garcom = new Garcom(null); // criamos primeiro o gar�om sem uma cozinha associada
        Cozinheiro cozinheiro = new Cozinheiro(garcom); // criamos a cozinha e passamos o gar�om como par�metro
        garcom = new Garcom(cozinheiro); // associamos o gar�om com a cozinha criada
        garcom.enviarPedido("Hamburguer"); // fazemos o pedido
    }
}
