package hortifruti;

public class Desconto extends Hortifruti {
	private double valorDescontoPorcentagem;

	public double getValorDesconto() {
		return valorDescontoPorcentagem;
	}

	public void setValorDescontoPorcentagem(double valorDescontoPorcentagem) {
		this.valorDescontoPorcentagem = valorDescontoPorcentagem;
		notificarTodos();
	}
}
