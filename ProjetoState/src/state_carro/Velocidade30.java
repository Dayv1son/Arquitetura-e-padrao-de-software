package state_carro;
import state.State;

public class Velocidade30 implements State{
	private static int count = 2;
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
		return new VelocidadeMaxima();
	}

	@Override
	public State frear() {
		System.out.println("Diminuindo a velocidade");
		return new Velocidade20();
	}

	@Override
	public State fazerCurva() {
		if(count > 0) {
			count--;
			System.out.println("Curva realizada com sucesso, no entanto foi perigosa. Diminua a velocidade na proxima vez");
			return this;
		}
		System.out.println("O carro bateu no poste durante a curva");
		return new Quebrado();
	}

	@Override
	public void resultado() {
		System.out.println("O carro esta a 30 kilometros por hora");
		
	}

}
