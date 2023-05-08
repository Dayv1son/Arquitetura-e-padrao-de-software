package principal;
import composite.*;

public class Principal {

	public static void main(String[] args) {
		Componente folha1 = new Folha();
        Componente folha2 = new Folha();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.adicionar(folha1);
        composite1.adicionar(folha2);
        composite2.adicionar(composite1);
        composite2.operacao();
	}

}
