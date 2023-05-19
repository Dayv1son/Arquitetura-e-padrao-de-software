package model_proxy;

public class AlertaProxy implements AtividadesCotidianas {
	
	private Pessoa pessoa;
	
	public AlertaProxy(Pessoa pessoa){
		this.pessoa = pessoa;
	}
	
	@Override
	public void arrumarCasa() {
		System.out.println("A casa esta suja e bagunçada");		
		pessoa.arrumarCasa();
	}

	@Override
	public void fazerComida() {
		System.out.println("Nao tem comida");
		pessoa.fazerComida();
	}

	@Override
	public void fazerCompras() {
		System.out.println("Os produtos em casa acabaram");
		pessoa.fazerCompras();
		
	}

	@Override
	public void estudar(String str) {
		if(str == "") {
			System.out.println("Estudo pendente");
			pessoa.estudar(str);
		}else {
			System.out.println("Estudo pendente sobre "+str);
			pessoa.estudar(str);
		}
		
	}
}
