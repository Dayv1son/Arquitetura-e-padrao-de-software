package hortifruti;
import java.util.ArrayList;
import java.util.List;

public abstract class Hortifruti {
private List<ObserverHortifruti> observers = new ArrayList<>();
	
	public void adicionar(ObserverHortifruti o) {
		this.observers.add(o);
	}
	
	public void eliminar(ObserverHortifruti o) {
		this.observers.remove(o);
	}
	
	public void notificarTodos() {
		for (ObserverHortifruti observer : observers) {
			observer.update();
		}
	}
}
