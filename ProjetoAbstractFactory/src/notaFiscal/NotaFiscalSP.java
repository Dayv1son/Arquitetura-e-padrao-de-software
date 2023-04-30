package notaFiscal;

import veiculo.Veiculo;

public class NotaFiscalSP implements NotaFiscal {

	@Override
	public double calcularImposto(Veiculo veiculo) {
		double imposto = 0.12;
		imposto = veiculo.getPreco() * imposto;
		return imposto;
	}

}
