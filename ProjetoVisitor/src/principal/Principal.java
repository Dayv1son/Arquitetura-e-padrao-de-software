package principal;
import java.util.ArrayList;
import java.util.List;

import formas.Circulo;
import formas.Forma;
import formas.Quadrado;
import visitor.AreaVisitor;

public class Principal {
	public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        Circulo circulo = new Circulo(6);
        Quadrado quadrado = new Quadrado(7);
        
        formas.add(circulo);
        formas.add(quadrado);

        AreaVisitor areaVisitor = new AreaVisitor();
        for (Forma forma : formas) {
            forma.accept(areaVisitor);
        }

        double totalArea = areaVisitor.getTotalArea();
        System.out.println("Total area: " + totalArea);
    }
}
