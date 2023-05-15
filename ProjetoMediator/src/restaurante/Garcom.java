package restaurante;

public class Garcom implements Mediator {
	private Cozinheiro cozinheiro;

    public Garcom(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public void enviarPedido(String pedido) {
        System.out.println("Gar�om: o pedido recebido foi " + pedido);
        cozinheiro.prepararComida(pedido);
    }

    public void entregarComida(String comida) {
        System.out.println("Gar�om: a comida " + comida + " esta pronta");
    }
}

