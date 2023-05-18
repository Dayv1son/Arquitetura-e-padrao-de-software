package prototype;

public class Pessoa implements Prototype {
	private String nome;
	private int idade;
	private String estado_civil;
	
	public Pessoa(String nome, int idade, String estado_civil) {
		this.nome = nome;
		this.idade = idade;
		this.estado_civil = estado_civil;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getEstado_civil() {
		return estado_civil;
	}
	
	
	
	@Override
	public String toString() {
		return "nome: " + nome + ", idade: " + idade + ", estado civil: " + estado_civil;
	}

	@Override
    public Prototype clone() {
		System.out.println("Clonando uma pessoa");
        return new Pessoa(nome, idade, estado_civil);
    }
}
