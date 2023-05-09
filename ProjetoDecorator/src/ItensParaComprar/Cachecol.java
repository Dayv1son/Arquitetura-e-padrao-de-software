package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Cachecol extends Decorator {

	public Cachecol(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarCachecol() {
		System.out.println("Comprando um cachecol");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarCachecol();
	}
	
}
