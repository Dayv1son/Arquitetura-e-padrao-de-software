package ComponentesEssenciais;

public class Processador {
	public static void adicionarProcessador(String str) {
		if(str == "") {
			System.out.println("Adicionando um processador");
		}else {
			System.out.println("Adicionando um processador "+str);
		}
	}
}
