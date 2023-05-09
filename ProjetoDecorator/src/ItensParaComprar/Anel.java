package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Anel extends Decorator {

	public Anel(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarAnel() {
		System.out.println("Comprando um anel");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarAnel();
	}

}
