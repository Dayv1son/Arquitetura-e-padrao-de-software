package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Casaco extends Decorator{

	public Casaco(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarCasaco() {
		System.out.println("Comprando um casaco");
	}

	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarCasaco();
	}
	
}
