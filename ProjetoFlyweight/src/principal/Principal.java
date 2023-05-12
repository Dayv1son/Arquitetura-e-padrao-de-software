package principal;
import produto.Produto;

public class Principal {
	public static void main(String[] args) {

		Produto cafe = Produto.criarProduto("Café", "Cafe 3 coracoes 500g", 18.00, true);
        Produto arroz = Produto.criarProduto("Arroz", "Arroz integral 1kg", 6.00, true);
        Produto queijoMinas = Produto.criarProduto("Queijo", "Queijo minas 1kg", 25.00, true);
        Produto queijoMussarela = Produto.criarProduto("Queijo", "Queijo Mussarela 1kg", 25.00, true);

        
        Produto feijao = Produto.criarProduto("Feijão", "Feijão carioca 1kg", 7.50, false);
        Produto macarrao = Produto.criarProduto("Macarrão", "Macarrão espaguete 500g", 5.00, false);

        System.out.println(cafe);
        System.out.println(arroz);
        System.out.println(feijao);
        System.out.println(macarrao);
        System.out.println(queijoMinas);
        System.out.println(queijoMussarela);
    }

}
