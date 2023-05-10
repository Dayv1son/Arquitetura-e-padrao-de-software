package ComponentesEssenciais;

public class MemoriaRAM {
	public static void adicionarMemoriaRAM(String str) {
		if(str == "") {
			System.out.println("Adicionando uma memoria RAM de 8 GB");
		}else {
			System.out.println("Adicionando uma memoria RAM de "+str);
		}
	}
}
