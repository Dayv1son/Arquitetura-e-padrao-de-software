package funcoes_calculadora;
import statregy.StrategyCalculadora;

public class Maior implements StrategyCalculadora{

	
	public double operacao(double n1, double n2) {
		if(n1 > n2) {
			return n1;
		}else {
			if(n1 == n2) {
				System.out.print("Ambos os numeros sao iguais a ");

			}
			return n2;

		}
	}

}
