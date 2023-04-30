package venda;
import boleto.Boleto;
import inflacao.Inflacao;
import notaFiscal.NotaFiscal;
import veiculo.Veiculo;

public class Venda {
	private Boleto boleto;
	private NotaFiscal NF;
	private Inflacao inflacao;
	
	public Venda(VendaFactory factory) {
		this.boleto = factory.criarBoleto();
		this.NF = factory.criarNotaFiscal();
		this.inflacao = factory.criarInflacao();
	}
	
	public void realizarVenda(Veiculo veiculo) {
		double imposto = NF.calcularImposto(veiculo);
		double infl = inflacao.calcularInflacao(veiculo);
		boleto.emitirBoleto(veiculo, imposto, infl);
	}
}
