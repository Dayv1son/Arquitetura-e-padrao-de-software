package ItensParaComprar;
import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Bermuda extends Decorator {

	public Bermuda(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarBermuda() {
		System.out.println("Comprando uma bermuda");
	}

	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarBermuda();
	}

}
