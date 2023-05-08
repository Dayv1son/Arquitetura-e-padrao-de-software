package composite;
import java.util.List;
import java.util.ArrayList;

public class Composite extends Componente {
	
	private List<Componente> componentes = new ArrayList<Componente>();

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void remover(Componente c) {
        componentes.remove(c);
    }

    public void operacao() {
        for (Componente c : componentes) {
            c.operacao();
        }
    }
}
