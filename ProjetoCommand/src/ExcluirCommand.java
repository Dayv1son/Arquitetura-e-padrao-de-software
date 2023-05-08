
public class ExcluirCommand implements Command {
	
	/*public void executeID(int id) {
		System.out.println("O id "+id+" foi excluido");
	}*/
	
	public void execute(Pessoa p) {
		System.out.println("O(A) cliente "+p.getNome()+" de id "+p.getIdd()+
		" foi excluido");
	}
}
