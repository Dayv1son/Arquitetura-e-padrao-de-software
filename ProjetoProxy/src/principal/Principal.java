package principal;
import model_proxy.AlertaProxy;
import model_proxy.AtividadesCotidianas;
import model_proxy.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		AtividadesCotidianas atividadesCotidianas = new AlertaProxy(pessoa);
		
		pessoa.fazerCompras();
		atividadesCotidianas.arrumarCasa();
	}
}

//Objetivo: Criar uma f�brica de rob�s (selecionando as pe�as que vc deseja)