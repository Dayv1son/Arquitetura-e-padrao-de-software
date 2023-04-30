package cliente;
import concessionaria.ConcessionariaA;
import concessionaria.ConcessionariaC;
import veiculo.Veiculo;
import venda.Venda;
import venda.VendaFactory;

public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		v1.setCor("Preto");
		v1.setKilometragem(100);
		v1.setMarca("Fiat");
		v1.setPreco(20000);
		v1.setTipoVeiculo("Carro");
		
		VendaFactory vf1 = new ConcessionariaA();
		Venda venda1 = new Venda(vf1);
		venda1.realizarVenda(v1);
		
		System.out.println("\n");
		
		Veiculo v2 = new Veiculo();
		v2.setCor("Prata");
		v2.setKilometragem(15);
		v2.setMarca("Hyundai");
		v2.setPreco(15000);
		v2.setTipoVeiculo("Moto");
		
		VendaFactory vf2 = new ConcessionariaC();
		Venda venda2 = new Venda(vf2);
		venda2.realizarVenda(v2);
	}

}
