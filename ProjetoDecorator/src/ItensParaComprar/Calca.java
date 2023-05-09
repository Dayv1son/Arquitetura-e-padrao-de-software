package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Calca extends Decorator{

	public Calca(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarCalca() {
		System.out.println("Comprando uma Calca");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarCalca();
	}

}
