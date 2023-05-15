package principal;
import restaurante.Cozinheiro;
import restaurante.Garcom;

public class Cliente {
	public static void main(String[] args) {
		Garcom garcom = new Garcom(null); // criamos primeiro o garçom sem uma cozinha associada
        Cozinheiro cozinheiro = new Cozinheiro(garcom); // criamos a cozinha e passamos o garçom como parâmetro
        garcom = new Garcom(cozinheiro); // associamos o garçom com a cozinha criada
        garcom.enviarPedido("Hamburguer"); // fazemos o pedido
    }
}
