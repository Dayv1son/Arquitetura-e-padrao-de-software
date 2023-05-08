
public class Cliente {

	public static void main(String[] args) {
		Invoker.listar();
		Invoker.excluirID(2);
		Invoker.adicionarID(1, "Dennis");
		//Invoker.adicionarID(1);
		Invoker.adicionarID(1, "Pedro");
		Invoker.adicionarID(3, "Maria");
		Invoker.adicionarID(2, "Joana");
		
		Invoker.listar();
		Invoker.excluirID(2);
		Invoker.listar();
		Invoker.excluirID(20);
		Invoker.alterarID(3, 55);
		Invoker.listar();

	}

}
