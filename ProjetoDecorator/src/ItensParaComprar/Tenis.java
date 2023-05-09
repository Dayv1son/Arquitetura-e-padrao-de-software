package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Tenis extends Decorator {

	public Tenis(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarTenis() {
		System.out.println("Comprando um tenis");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarTenis();
	}
	
}
