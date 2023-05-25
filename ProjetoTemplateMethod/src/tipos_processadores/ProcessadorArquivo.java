package tipos_processadores;
import template_method.Processador;

public class ProcessadorArquivo extends Processador {
	public void prepararDados() {
        System.out.println("Preparando dados do arquivo");
    }

    public void validarDados() {
        System.out.println("Validando dados do arquivo");
    }

    public void executarProcessamento() {
        System.out.println("Processando arquivo");
    }

    public void exibirResultados() {
        System.out.println("Exibindo resultados do processamento do arquivo");
    }
}
