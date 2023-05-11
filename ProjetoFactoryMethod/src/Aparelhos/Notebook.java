package Aparelhos;
import Atividades.AtividadesEletrodomestico;

public class Notebook extends AtividadesEletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando o notebook");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o notebook");
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando o volume do notebook");
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo o volume do notebook");
		
	}

}
