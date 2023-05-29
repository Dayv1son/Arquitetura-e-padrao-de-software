package visitor;
import formas.Circulo;
import formas.Quadrado;

public interface Visitor {
	  void visit(Circulo circulo);
	  void visit(Quadrado quadrado);
}
