package statregy;

public class FuncoesCalculadora {
	private StrategyCalculadora sc;
	
	public FuncoesCalculadora(StrategyCalculadora sc) {
		this.sc = sc;
	}
	
	public double calcular(double n1, double n2) {
		return sc.operacao(n1, n2);
	}
	
}
