package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Blusa extends Decorator{

	public Blusa(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarBlusa() {
		System.out.println("Comprando uma blusa");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarBlusa();
	}
}
