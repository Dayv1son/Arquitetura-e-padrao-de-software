package principal;
import termometro.TemperaturaAdapter;

public class Principal {

	public static void main(String[] args) {
		TemperaturaAdapter t1 = new TemperaturaAdapter();
		t1.setTemperatura("67 F");
		System.out.println(	"67 F em graus celsius: " + t1.getTemperatura());
		
		TemperaturaAdapter t2 = new TemperaturaAdapter();
		t2.setTemperatura("300 K");
		System.out.println("300 K em graus celsius: " + t2.getTemperatura());

	}

}
