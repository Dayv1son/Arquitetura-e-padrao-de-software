package iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
        List<Produto> listaProduto = new ArrayList<>();
        
        Produto p1 = new Produto("bola", 10.00, 15);
        Produto p2 = new Produto("bala", 1.00, 200);
        Produto p3 = new Produto("Ventilador", 179.90, 4);
        
        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);
        
        Iterator<Produto> iterator = listaProduto.iterator();
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            System.out.println(p.getNome());
        }
    }
}
