package template_method;

public abstract class Processador {
	public void templateMethodProcessar() {
        prepararDados();
        validarDados();
        executarProcessamento();
        exibirResultados();
    }

    public abstract void prepararDados();
    public abstract void validarDados();
    public abstract void executarProcessamento();
    public abstract void exibirResultados();
}
