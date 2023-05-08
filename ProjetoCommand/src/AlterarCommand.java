
public class AlterarCommand implements Command {
	/*public void executeID(int id) {
		System.out.println("O id "+id+" foi alterado");

	}*/
	
	public void execute(Pessoa p) {
		System.out.println("O id "+p.getIdd()+" do(a) cliente "+p.getNome()+ 
		" foi alterado");
	}
}
