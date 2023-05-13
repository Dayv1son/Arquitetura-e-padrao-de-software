package interpreter;
import java.util.ArrayList;
import java.util.List;

import comandos.Comando;
import comandos.FalarComando;
import comandos.MoverComando;
import comandos.PegarComando;
import comandos.PularComando;
import comandos.VirarDireitaComando;
import comandos.VirarEsquerdaComando;

public class InterpreterRobo {
    private List<Comando> comandos = new ArrayList<>();
    
    public InterpreterRobo(String entradaDados) {
        String[] tokens = entradaDados.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "mover":
                    int distancia = Integer.parseInt(tokens[i+1]);
                    Comando moverComando = new MoverComando(distancia);
                    comandos.add(moverComando);
                    break;
                    
                case "virar":
                    String direcao = tokens[i+1];
                    Comando virarComando = null;
                    switch (direcao) {
                        case "esquerda":
                            virarComando = new VirarEsquerdaComando();
                            break;
                        case "direita":
                            virarComando = new VirarDireitaComando();
                            break;
                    }
                    comandos.add(virarComando);
                    break;
                    
                case "falar":
                	Comando falarComando = new FalarComando();
                    comandos.add(falarComando);
                    break;
                    
                case "pegar":
                    String item = tokens[i+1];
                    Comando pegarComando = new PegarComando(item);
                    comandos.add(pegarComando);
                    break;
                
                case "pular":
                    Comando pularComando = new PularComando();
                    comandos.add(pularComando);
                    break;
            }
        }
    }
    
    public void executarComandos() {
        for (Comando command : comandos) {
            command.execute();
        }
    }
}