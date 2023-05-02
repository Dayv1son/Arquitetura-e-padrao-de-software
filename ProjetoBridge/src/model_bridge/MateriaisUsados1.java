package model_bridge;

public class MateriaisUsados1 extends Robot {

	@Override
	public void criarBraco() {
		System.out.println("Arma de fogo");		
	}

	@Override
	public void criarPerna() {
		System.out.println("Tentaculos grossos e metalicos");
		
	}

	@Override
	public void cabeca() {
		System.out.println("Cabeca oval de tamanho mediano");
		
	}

	@Override
	public void corpo() {
		System.out.println("Corpo magro e pequeno");
		
	}

}
