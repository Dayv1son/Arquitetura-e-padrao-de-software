package ModeloFacade;
import ComponentesEssenciais.*;
import ComponentesOpcionais.*;

public class Facade {
	
	public void montarPCPadrao() {
		System.out.println("-----------Montando um computador-----------\n\n");
		System.out.println("Compontentes essenciais:");
		Fonte.adicionarFonte("");
		HD.adicionarHD("");
		MemoriaRAM.adicionarMemoriaRAM("");
		PlacaMae.adicionarPlacaMae("");
		Processador.adicionarProcessador("");
	}
	
	public void montarPCPersonalizado(String fonte, String hd, String memoriaram, String placamae, String processador) {
		System.out.println("-----------Montando um computador-----------\n\n");
		System.out.println("Compontentes essenciais:");
		Fonte.adicionarFonte(fonte);
		HD.adicionarHD(hd);
		MemoriaRAM.adicionarMemoriaRAM(memoriaram);
		PlacaMae.adicionarPlacaMae(placamae);
		Processador.adicionarProcessador(processador);
	}
	
	public void opcionalPadrao() {
		System.out.println("\n\n-----------Partes opcionais para um computador-----------\n\n");
		Headset.adicionarHeadset("");
		Mouse.adicionarMouse("");
		MousePad.adicionarMousePad("");
		PlacaVideo.adicionarPlacaVideo("");
		Monitor.adicionarMonitor("");
		Teclado.adicionarTeclado("");
	}
	
	public void opcionalPersonalizado(String headset, String mouse, String mousepad, String placavideo, String monitor, String teclado) {
		System.out.println("\n\n-----------Partes opcionais para um computador-----------\n\n");
		Headset.adicionarHeadset(headset);
		Mouse.adicionarMouse(mouse);
		MousePad.adicionarMousePad(mousepad);
		PlacaVideo.adicionarPlacaVideo(placavideo);
		Monitor.adicionarMonitor(monitor);
		Teclado.adicionarTeclado(teclado);
	}
}
