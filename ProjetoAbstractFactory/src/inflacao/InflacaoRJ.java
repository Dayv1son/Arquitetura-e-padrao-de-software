package inflacao;
import veiculo.Veiculo;

public class InflacaoRJ implements Inflacao {

	@Override
	public double calcularInflacao(Veiculo veiculo) {
		double inflacao = 0.08;
		inflacao = veiculo.getPreco() * inflacao;
		return inflacao;
	}

}
