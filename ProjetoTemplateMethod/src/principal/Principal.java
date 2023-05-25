package principal;
import template_method.Processador;
import tipos_processadores.ProcessadorArquivo;
import tipos_processadores.ProcessadorBD;

public class Principal {
	 public static void main(String[] args) {
		 Processador processadorArquivo = new ProcessadorArquivo();
	     processadorArquivo.templateMethodProcessar();
	     
	     System.out.println("");
	     
	     Processador processadorBD = new ProcessadorBD();
	     processadorBD.templateMethodProcessar();
	    }
}
