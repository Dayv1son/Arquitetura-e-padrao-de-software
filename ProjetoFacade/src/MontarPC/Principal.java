package MontarPC;
import ModeloFacade.Facade;
public class Principal {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.montarPCPadrao();
		f.opcionalPadrao();
	}

}
