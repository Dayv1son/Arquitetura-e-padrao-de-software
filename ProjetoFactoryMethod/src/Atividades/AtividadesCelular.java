package Atividades;
import Aparelhos.Celular;
import Aparelhos.Eletrodomestico;

public class AtividadesCelular extends Eletrodomestico {

	@Override
	public AtividadesEletrodomestico criarEletrodomestico() {
		return new Celular();
	}

}
