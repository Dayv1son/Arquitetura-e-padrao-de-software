package model_proxy;

public class Pessoa implements AtividadesCotidianas{

	@Override
	public void arrumarCasa() {
		System.out.println("A casa foi arrumada");
	}

	@Override
	public void fazerComida() {
		System.out.println("A comida foi feita");
		
	}

	@Override
	public void fazerCompras() {
		System.out.println("As compras foram realizadas");
		
	}

	public void estudar(String str) {
		if(str == "") {
			System.out.println("Estudos concluidos" + str);
		}
		else {
			System.out.println("Estudos concluidos sobre "+str);
		}
	}

}
