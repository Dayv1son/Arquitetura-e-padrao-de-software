package Loja;

public abstract class Decorator extends LojaDeRoupa {
	private LojaDeRoupa loja;
	
	public Decorator(LojaDeRoupa decorator) {
		this.loja = decorator;
	}

	public void comprarVestimenta() {
		loja.comprarVestimenta();
	}	

}
