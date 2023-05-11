package Atividades;
import Aparelhos.Eletrodomestico;
import Aparelhos.Televisao;

public class AtividadesTelevisao extends Eletrodomestico{

	@Override
	public AtividadesEletrodomestico criarEletrodomestico() {
		return new Televisao();
	}

}
