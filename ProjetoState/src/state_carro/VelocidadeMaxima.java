package state_carro;
import state.State;

public class VelocidadeMaxima implements State{

	@Override
	public State ligarCarro() {
		System.out.println("O carro permanece ligado");
		return this;
	}

	@Override
	public State desligarCarro() {
		System.out.println("Pare o carro primeiramente para desliga-lo");
		return this;
	}

	@Override
	public State acelerar() {
		System.out.println("O carro esta na velocidade maxima");
		return this;
	}

	@Override
	public State frear() {
		System.out.println("Diminuindo a velocidade");
		return new Velocidade30();
	}

	@Override
	public State fazerCurva() {
		System.out.println("O carro capotou e ficou quebrado");
		return new Quebrado();
	}

	@Override
	public void resultado() {
		System.out.println("O carro esta em sua velocidade maxima de 40 kilometros por hora");
		
	}

}
