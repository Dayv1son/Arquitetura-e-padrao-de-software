package state_carro;
import state.State;

public class Carro implements State{
	
	@Override
	public State ligarCarro() {
		System.out.println("Pronto para movimento");
		return new CarroAtivo();
	}
	
	@Override
	public State desligarCarro() {
		System.out.println("O carro ja esta desligado");
		return this;
	}
	
	@Override
	public State acelerar() {
		System.out.println("O carro precisa ser ligado primeiro");
		return this;
	}
	
	@Override
	public State frear() {
		System.out.println("O carro precisa ser ligado primeiro");
		return this;
	}
	
	@Override
	public State fazerCurva() {
		System.out.println("O carro esta parado");
		return this;
	}

	@Override
	public void resultado() {
		System.out.println("Carro estagnado");
		
	}

}
