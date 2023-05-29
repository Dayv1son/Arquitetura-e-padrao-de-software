package formas;
import visitor.Visitor;

public class Circulo implements Forma {
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	
    public Circulo(double raio) {
        this.raio = raio;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
