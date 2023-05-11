package Aparelhos;
import Atividades.AtividadesEletrodomestico;

public class Televisao extends AtividadesEletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando a televisao");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando a televisao");
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando o volume da televisao");
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo o volume da televisao");
		
	}

}
