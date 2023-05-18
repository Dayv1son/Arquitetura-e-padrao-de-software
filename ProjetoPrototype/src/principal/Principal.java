package principal;
import prototype.Pessoa;

public class Principal {
	public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mike", 26, "união estável");
        Pessoa p2 = (Pessoa) p1.clone();
        Pessoa p3 = (Pessoa) p1.clone();
        
        System.out.println("");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
