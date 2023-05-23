package state_carro;
import state.State;

public class CarroAtivo implements State {

	@Override
	public State ligarCarro() {
		System.out.println("O carro ja esta ligado");
		return this;
	}

	@Override
	public State desligarCarro() {
		System.out.println("Desligando o carro");
		return new Carro();
	}

	@Override
	public State acelerar() {
		System.out.println("Acelerando");
		return new Velocidade10();
	}

	@Override
	public State frear() {
		System.out.println("O carro permanece parado");
		return this;
	}

	@Override
	public State fazerCurva() {
		System.out.println("Nao da pra fazer curva com o carro parado");
		return this;
	}

	@Override
	public void resultado() {
		System.out.println("Carro parado e aguardando os comandos do motorista");
		
	}

}
