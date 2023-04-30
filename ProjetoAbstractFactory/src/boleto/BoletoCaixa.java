package boleto;

import veiculo.Veiculo;

public class BoletoCaixa implements Boleto {

	@Override
	public void emitirBoleto(Veiculo veiculo, double imposto, double inflacao) {
		System.out.println("BANCO CAIXA");
		System.out.println("-------------------------------------------------------");
		System.out.println("Tipo do veiculo: "+ veiculo.getTipoVeiculo());
		System.out.println("Marca: "+ veiculo.getMarca());
		System.out.println("Cor: "+ veiculo.getCor());
		System.out.println("Kilometragem: "+veiculo.getKilometragem());
		System.out.println("Preco do veiculo: R$ "+veiculo.getPreco());
		System.out.println("Preco do imposto: R$"+imposto);
		System.out.println("Preco da inflacao: R$ "+inflacao);
		System.out.println("Preco total: R$ "+(veiculo.getPreco() + imposto + inflacao));

	}

}
