package boleto;
import veiculo.Veiculo;

public interface Boleto {
	public void emitirBoleto(Veiculo veiculo, double imposto, double inflacao);
}
