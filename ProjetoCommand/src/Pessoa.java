
public class Pessoa {
	
	private int idd;
	private Command command;
	private String nome; 
	
	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public Pessoa(int idd, String nome, Command command) {
		this.idd = idd;
		this.command = command;
		this.nome = nome;
	}
}

//Objetivo: além do id, guarda o comando e o nome do cliente