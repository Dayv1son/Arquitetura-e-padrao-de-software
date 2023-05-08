import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
	private static Map<Integer, Class> comandos = new HashMap<Integer, Class>();
	//private static List<Integer> historico = new ArrayList<Integer> ();
	private static List<Pessoa> historico = new ArrayList<Pessoa> ();
	
	static {
		//comandos.put(1, AddCommand.class);
		//comandos.put(2, ExcluirCommand.class);
		//comandos.put(3, AlterarCommand.class);
	}
	
	public static void adicionarID(int id, String nome) {
		boolean decidir = true;
		//for(Integer ids : historico) {
		for(int i = 0; i < historico.size(); i++) {
			if(historico.get(i).getIdd() == id) {
				decidir = false;
			}
		}
		
		if(decidir == true) {
			comandos.put(id, AddCommand.class);

			try {
		//comandos.get(command).execute();
				Command c = (Command)comandos.get(id).newInstance();
				//c.executeID(id);
				//historico.add(id);
				Pessoa p = new Pessoa(id, nome, c);
				c.execute(p);
				historico.add(p);
			}catch (InstantiationException e) {
				e.printStackTrace();
			}catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Ja existe o id "+id);
		}
	}
	
	public static void listar() {
		if(historico.isEmpty()) {
			System.out.println("Nao existe nenhum id registrado");
		}else {
			System.out.print("Ids disponiveis:");
			//for(Integer command : historico) {
			for(int i = 0; i < historico.size(); i++) {
				//command.execute();
				//System.out.print(" "+command);
				System.out.print(" "+historico.get(i).getIdd());
			}
			System.out.println();
		}
	}
	
	public static void excluirID(int id) {
		if(historico.isEmpty()) {
			System.out.println("Nao existe nenhum id registrado");
		}else {
			boolean achou = false;
			//for(Integer i : historico) {
			for(int i = 0; i < historico.size(); i++) {
				//if(i == id) {
				if(historico.get(i).getIdd() == id) {
					achou = true;
					try {
						//comandos.get(command).execute();
						
						comandos.put(id, ExcluirCommand.class);
						Command c = (Command)comandos.get(id).newInstance();
						//c.executeID(id);
						c.execute(historico.get(i));
						historico.remove(i);
						//historico.add(id);
					}catch (InstantiationException e) {
						e.printStackTrace();
					}catch (IllegalAccessException e) {
						e.printStackTrace();
					}	
					break;
				}
			}
			if(!achou) {
				System.out.println("Nao existe o id "+id+" registrado para ser excluido");
			}
			
		}
	}
	
	public static void alterarID(int id, int id2){
		if(historico.isEmpty()) {
			System.out.println("Nao existe nenhum id registrado");
		}else {
			boolean achou = false;
			//for(Integer i : historico) {
			for(int i = 0; i < historico.size(); i++) {
				if(historico.get(i).getIdd() == id) {
					achou = true;					
					try {
						comandos.put(id, AlterarCommand.class);
						Command c = (Command)comandos.get(id).newInstance();
						//c.executeID(id);
						//historico.set(i, id2);
						c.execute(historico.get(i));
						historico.get(i).setIdd(id2);
						
					}catch (InstantiationException e) {
						e.printStackTrace();
					}catch (IllegalAccessException e) {
						e.printStackTrace();
					}	
					
					break;
				}
			}
			if(!achou) {
				System.out.println("Nao existe o id "+id+" registrado para ser alterado");
			}
		}
	}
}

