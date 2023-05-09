package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Oculos extends Decorator {

	public Oculos(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarOculos() {
		System.out.println("Comprando um oculos");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarOculos();
	}
}
