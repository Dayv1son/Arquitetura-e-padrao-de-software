package funcoes_calculadora;
import statregy.StrategyCalculadora;

public class Potenciacao implements StrategyCalculadora{

	
	public double operacao(double n1, double n2) {
		double resultado = n1;
		for(int i = 1; i < n2; i++) {
			resultado *= n1;
		}
		return resultado;
	}

}
