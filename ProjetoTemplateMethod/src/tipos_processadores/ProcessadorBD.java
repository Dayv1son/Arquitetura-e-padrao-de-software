package tipos_processadores;
import template_method.Processador;

public class ProcessadorBD extends Processador {
	public void prepararDados() {
        System.out.println("Conectando ao banco de dados");
        System.out.println("Preparando consulta");
    }

    public void validarDados() {
        System.out.println("Validando consulta");
    }

    public void executarProcessamento() {
        System.out.println("Executando consulta");
    }

    public void exibirResultados() {
        System.out.println("Exibindo resultados do processamento do banco de dados");
    }
}
