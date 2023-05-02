package principal;
import model_bridge.MateriaisUsados1;
import model_bridge.ModeloRobo1;

public class Principal {

	public static void main(String[] args) {
		//MateriaisUsados2 mu = new MateriaisUsados2();
		ModeloRobo1 mr = new ModeloRobo1();
		mr.setRobot(new MateriaisUsados1());
		mr.montaRobo();
	}

}
