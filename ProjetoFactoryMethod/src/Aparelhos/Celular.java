package Aparelhos;
import Atividades.AtividadesEletrodomestico;

public class Celular extends AtividadesEletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando o celular");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o celular");		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando o volume do celular");
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo o volume do celular");
		
	}

}
