package state_carro;
import state.State;

public class Quebrado implements State {

	@Override
	public State ligarCarro() {
		System.out.println("Funcionalidade inoperante");
		return this;
	}

	@Override
	public State desligarCarro() {
		System.out.println("Funcionalidade inoperante");
		return this;
	}

	@Override
	public State acelerar() {
		System.out.println("Funcionalidade inoperante");
		return this;
	}

	@Override
	public State frear() {
		System.out.println("Funcionalidade inoperante");
		return this;
	}

	@Override
	public State fazerCurva() {
		System.out.println("Funcionalidade inoperante");
		return this;
	}

	@Override
	public void resultado() {
		System.out.println("O carro esta quebrado");
		
	}

}
