package visitor;
import formas.Circulo;
import formas.Quadrado;

public class AreaVisitor implements Visitor {
	 double totalArea;

	 public void visit(Circulo circulo) {
	     double area = Math.PI * circulo.getRaio() * circulo.getRaio();
	     totalArea += area;
	 }

	 public void visit(Quadrado quadrado) {
	      double area = quadrado.getLado() * quadrado.getLado();
	      totalArea += area;
	 }

	 public double getTotalArea() {
	      return totalArea;
	 }
}
