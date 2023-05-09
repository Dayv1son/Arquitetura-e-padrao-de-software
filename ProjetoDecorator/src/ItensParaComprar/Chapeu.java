package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Chapeu extends Decorator {
	public Chapeu(LojaDeRoupa decorator) {
		super(decorator);
			// TODO Auto-generated constructor stub
		}
	
	public void comprarChapeu() {
		System.out.println("Comprando um chapeu");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarChapeu();
	}
	
}
