package principal;
import interpreter.InterpreterRobo;

public class Usuario {

	public static void main(String[] args) {
		InterpreterRobo interpreter = new InterpreterRobo("mover 10 virar esquerda falar pular mover 5 virar direita pegar bola");
        interpreter.executarComandos();
	}

}
