package notaFiscal;
import veiculo.Veiculo;

public class NotaFiscalRj implements NotaFiscal {

	@Override
	public double calcularImposto(Veiculo veiculo) {
		double imposto = 0.15;
		imposto = veiculo.getPreco() * imposto;
		return imposto;
	}

}
