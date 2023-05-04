package permissao;

public class Permissao {
	private Permissao permissao;
	
	public Permissao(Permissao permissao) {
		this.permissao = permissao;
	}
	
	public void saberPermissao() {
		if(this.permissao != null) {
			this.permissao.saberPermissao();
		}else {
			System.out.println("Nao foi possivel obter conhecimento sobre a permissao dada");
		}
	}
}



//Essa seria a classe de permissão