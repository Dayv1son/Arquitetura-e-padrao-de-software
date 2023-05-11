package Aparelhos;
import Atividades.AtividadesEletrodomestico;

public abstract class Eletrodomestico {
	
	public abstract AtividadesEletrodomestico criarEletrodomestico();
	
	public void ligarAtividadeEletrodomestico() {
		AtividadesEletrodomestico ativ = criarEletrodomestico();
		ativ.ligar();
	}
	
	public void desligarAtividadeEletrodomestico() {
		AtividadesEletrodomestico ativ = criarEletrodomestico();
		ativ.desligar();
	}
	
	public void aumentarVolumeAtividadeEletrodomestico() {
		AtividadesEletrodomestico ativ = criarEletrodomestico();
		ativ.aumentarVolume();;
	}
	
	public void diminuirVolumeAtividadeEletrodomestico() {
		AtividadesEletrodomestico ativ = criarEletrodomestico();
		ativ.diminuirVolume();
	}
	
}
