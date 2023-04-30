package concessionaria;

import boleto.Boleto;
import boleto.BoletoCaixa;
import inflacao.Inflacao;
import inflacao.InflacaoBrasilia;
import notaFiscal.NotaFiscal;
import notaFiscal.NotaFiscalBrasilia;
import venda.VendaFactory;

public class ConcessionariaC implements VendaFactory{

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoCaixa();
		return boleto;
	}

	@Override
	public NotaFiscal criarNotaFiscal() {
		NotaFiscal NF = new NotaFiscalBrasilia();
		return NF;
	}

	@Override
	public Inflacao criarInflacao() {
		Inflacao inf = new InflacaoBrasilia();
		return inf;
	}
	
}
