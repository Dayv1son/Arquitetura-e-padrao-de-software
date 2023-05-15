package restaurante;

public class Cozinheiro implements Mediator {
	private Garcom garcom;

    public Cozinheiro(Garcom garcom) {
        this.garcom = garcom;
    }

    public void prepararComida(String pedido) {
        System.out.println("Cozinheiro: preparando a comida " + pedido);
        garcom.entregarComida(pedido);
    }

    public void enviarPedido(String pedido) {
    
    }

    public void entregarComida(String comida) {

    }
}
