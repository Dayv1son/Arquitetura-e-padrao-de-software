package produto;
import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;


public class Produto {
    private String nome;
    private String descricao;
    private double preco;

    private static Map<String, Produto> itensPopulares = new HashMap<>();

    private Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public static Produto criarProduto(String nome, String descricao, double preco, boolean popular) {
        if (popular) {
            if (!itensPopulares.containsKey(nome)) {
                itensPopulares.put(nome, new Produto(nome, descricao, preco));
            }
            return itensPopulares.get(nome);
        } else {
            return new Produto(nome, descricao, preco);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

	public String toString() {
		return nome + ": " + descricao + ", R$" + new DecimalFormat("#.00").format(preco);
	}    
}