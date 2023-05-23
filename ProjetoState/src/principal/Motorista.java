package principal;
import state.State;
import state_carro.Carro;

public class Motorista{

	public static void main(String[] args) {
		State simulaCarro = new Carro();
		simulaCarro = simulaCarro.frear();
		simulaCarro = simulaCarro.acelerar();
		simulaCarro = simulaCarro.ligarCarro();
		
		simulaCarro = simulaCarro.fazerCurva();
		simulaCarro = simulaCarro.acelerar();
		simulaCarro = simulaCarro.desligarCarro();

		simulaCarro = simulaCarro.acelerar();
		simulaCarro = simulaCarro.acelerar();

		simulaCarro = simulaCarro.fazerCurva();
		simulaCarro = simulaCarro.fazerCurva();
		simulaCarro = simulaCarro.frear();
		simulaCarro = simulaCarro.fazerCurva();
		
		simulaCarro.resultado();
		
	}

}
