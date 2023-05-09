package ItensParaComprar;
import Loja.Decorator;
import Loja.LojaDeRoupa;

public class Camiseta extends Decorator{

	public Camiseta(LojaDeRoupa decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public void comprarCamiseta() {
		System.out.println("Comprando uma camiseta");
	}
	

	public void comprarVestimenta() {
		super.comprarVestimenta();
		comprarCamiseta();
	}
	
	
}
