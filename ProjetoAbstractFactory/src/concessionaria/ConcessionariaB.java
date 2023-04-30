package concessionaria;

import boleto.Boleto;
import boleto.BoletoBradesco;
import inflacao.Inflacao;
import inflacao.InflacaoSP;
import notaFiscal.NotaFiscal;
import notaFiscal.NotaFiscalSP;
import venda.VendaFactory;

public class ConcessionariaB implements VendaFactory{

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBradesco();
		return boleto;
	}

	@Override
	public NotaFiscal criarNotaFiscal() {
		NotaFiscal NF = new NotaFiscalSP();
		return NF;
	}

	@Override
	public Inflacao criarInflacao() {
		Inflacao inf = new InflacaoSP();
		return inf;
	}

}
