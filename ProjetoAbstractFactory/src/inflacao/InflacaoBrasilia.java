package inflacao;

import veiculo.Veiculo;

public class InflacaoBrasilia implements Inflacao {

	@Override
	public double calcularInflacao(Veiculo veiculo) {
		double inflacao = 0.05;
		inflacao = veiculo.getPreco() * inflacao;
		return inflacao;
	}

}
