package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Cordao extends Decorator {

	public Cordao(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarCordao() {
		System.out.println("Comprando um cordao");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarCordao();
	}

}
