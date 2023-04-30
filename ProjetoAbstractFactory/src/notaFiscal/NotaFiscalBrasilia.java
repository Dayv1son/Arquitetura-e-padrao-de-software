package notaFiscal;

import veiculo.Veiculo;

public class NotaFiscalBrasilia implements NotaFiscal {

	@Override
	public double calcularImposto(Veiculo veiculo) {
		double imposto = 0.18;
		imposto = veiculo.getPreco() * imposto;
		return imposto;
	}

}
