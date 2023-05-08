
public class AddCommand implements Command {
	/*public void executeID(int id) {
		System.out.println("Adicionado o id "+id);
	}*/
	
	public void execute(Pessoa p) {
		System.out.println("Adicionado o(a) cliente "+p.getNome()+
		" e id "+p.getIdd());
	}
}
