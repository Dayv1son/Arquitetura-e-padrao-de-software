package ItensParaComprar;

import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Bone extends Decorator{
	public Bone(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarBone() {
		System.out.println("Comprando um bone");
	}
	
	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarBone();
	}

}
