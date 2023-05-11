package Principal;
import Aparelhos.Eletrodomestico;
import Atividades.AtividadesCelular;
import Atividades.AtividadesTelevisao;

public class Usuario {

	public static void main(String[] args) {
		Eletrodomestico tv = new AtividadesTelevisao();
		tv.ligarAtividadeEletrodomestico();
		tv.aumentarVolumeAtividadeEletrodomestico();
		tv.aumentarVolumeAtividadeEletrodomestico();
		
		System.out.println("");
		
		Eletrodomestico cel = new AtividadesCelular();
		cel.ligarAtividadeEletrodomestico();
		cel.desligarAtividadeEletrodomestico();

		
	}

}
