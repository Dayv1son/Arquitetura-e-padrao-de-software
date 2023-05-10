package ComponentesOpcionais;

public class PlacaVideo {
	public static void adicionarPlacaVideo(String str) {
		if(str == "") {
			System.out.println("Adicionando uma placa de video de 2 GB");
		}else {
			System.out.println("Adicionando uma placa de video "+str);
		}
	}
}
