package funcoes_calculadora;
import statregy.StrategyCalculadora;

public class Dividir implements StrategyCalculadora {

	public double operacao(double n1, double n2) {
		return n1/n2;
	}

}
