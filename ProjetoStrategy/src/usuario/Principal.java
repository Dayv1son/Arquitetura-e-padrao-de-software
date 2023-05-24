package usuario;
import funcoes_calculadora.*;
import statregy.FuncoesCalculadora;

public class Principal {

	public static void main(String[] args) {
		FuncoesCalculadora calculadora = new FuncoesCalculadora(new Maior());
		System.out.println(calculadora.calcular(5, 3));
		
		calculadora = new FuncoesCalculadora(new Potenciacao());
		System.out.println(calculadora.calcular(5, 3));
		
		calculadora = new FuncoesCalculadora(new Dividir());
		System.out.println(calculadora.calcular(5, 3));
	}

}
