package comandos;

public class MoverComando implements Comando {
	
	private int distancia;
    
    public MoverComando(int distancia) {
        this.distancia = distancia;
    }
    
    public void execute() {
        System.out.println("Movendo " + distancia + " unidades");
    }
}
