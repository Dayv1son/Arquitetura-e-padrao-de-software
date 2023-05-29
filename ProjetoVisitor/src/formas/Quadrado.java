package formas;
import visitor.Visitor;

public class Quadrado implements Forma {
	private double lado;
	
	public double getLado() {
		return lado;
	}
	
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
