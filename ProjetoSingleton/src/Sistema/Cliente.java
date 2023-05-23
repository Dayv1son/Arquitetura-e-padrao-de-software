package Sistema;

public class Cliente {
	private int id;
	private String nome;
	private String tipoUsuario;
	
	public Cliente(int id, String nome, String tipoUsuario) {
		this.id = id;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
