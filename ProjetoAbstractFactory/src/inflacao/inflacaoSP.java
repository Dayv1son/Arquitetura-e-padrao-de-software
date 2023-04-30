package inflacao;

import veiculo.Veiculo;

public class InflacaoSP implements Inflacao {

	@Override
	public double calcularInflacao(Veiculo veiculo) {
		double inflacao = 0.09;
		inflacao = veiculo.getPreco() * inflacao;
		return inflacao;
	}

}
