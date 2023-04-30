package concessionaria;
import boleto.Boleto;
import boleto.BoletoItau;
import inflacao.Inflacao;
import inflacao.InflacaoRJ;
import notaFiscal.NotaFiscal;
import notaFiscal.NotaFiscalRj;
import venda.VendaFactory;

public class ConcessionariaA implements VendaFactory {

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoItau();
		return boleto;
	}

	@Override
	public NotaFiscal criarNotaFiscal() {
		NotaFiscal NF = new NotaFiscalRj();
		return NF;
	}

	@Override
	public Inflacao criarInflacao() {
		Inflacao inf = new InflacaoRJ();
		return inf;
	}

}
