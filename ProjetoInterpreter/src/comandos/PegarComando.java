package comandos;

public class PegarComando implements Comando {
	
	private String item;
    
    public PegarComando(String item) {
        this.item = item;
    }
	
	public void execute() {
        System.out.println("Pegando o item "+ item);
	}
}
