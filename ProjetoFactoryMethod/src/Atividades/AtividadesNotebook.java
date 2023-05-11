package Atividades;
import Aparelhos.Eletrodomestico;
import Aparelhos.Notebook;

public class AtividadesNotebook extends Eletrodomestico {

	@Override
	public AtividadesEletrodomestico criarEletrodomestico() {
		return new Notebook();
	}

}
