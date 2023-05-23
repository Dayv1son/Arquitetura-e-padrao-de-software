package state_carro;
import state.State;

public class Velocidade10 implements State {

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
		System.out.println("Acelerando");
		return new Velocidade20();
	}

	@Override
	public State frear() {
		System.out.println("Diminuindo a velocidade");
		return new CarroAtivo();
	}

	@Override
	public State fazerCurva() {
		System.out.println("A curva foi realizada");
		return this;
	}

	@Override
	public void resultado() {
		System.out.println("O carro esta a 10 kilometros por hora");
		
	}

}
