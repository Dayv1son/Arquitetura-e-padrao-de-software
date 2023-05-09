package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Sapato extends Decorator{

	public Sapato(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarSapato() {
		System.out.println("Comprando um Sapato");
	}

	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarSapato();
	}
	
}
