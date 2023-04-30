package venda;
import boleto.Boleto;
import inflacao.Inflacao;
import notaFiscal.NotaFiscal;

public interface VendaFactory {
	public Boleto criarBoleto();
	public NotaFiscal criarNotaFiscal();
	public Inflacao criarInflacao();
	
}
