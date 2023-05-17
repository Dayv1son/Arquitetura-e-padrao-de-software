package cliente;
import java.util.Scanner;

import hortifruti.ConcretoFruta;
import hortifruti.ConcretoLegume;
import hortifruti.ConcretoVerdura;
import hortifruti.Desconto;
import hortifruti.ObserverHortifruti;

public class Principal {

	public static void main(String[] args) {
		int escolha;
		double escolha2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====================================================");
		System.out.println("Bem vindo ao hortifruti do povo");
		System.out.println("=====================================================\n");
		System.out.println("Faça as devidas promoçoes para os clientes!\n\n");
		
		do {
			mensagem();
			escolha = scan.nextInt();
			
			
			switch(escolha) {
				case 0: break;
				case 1:
					System.out.print("Digite a porcentagem do valor de desconto: ");
					escolha2 = scan.nextDouble();

					Desconto des = new Desconto();
					ObserverHortifruti oh1 = new ConcretoFruta(des);
					des.setValorDescontoPorcentagem(escolha2);
					break;
					
				case 2: 
					System.out.print("Digite a porcentagem do valor de desconto: ");
					escolha2 = scan.nextDouble();
					Desconto des2 = new Desconto();
					ObserverHortifruti oh2 = new ConcretoLegume(des2);
					des2.setValorDescontoPorcentagem(escolha2);
					break;
					
				case 3: 
					System.out.print("Digite a porcentagem do valor de desconto: ");
					escolha2 = scan.nextDouble();
					Desconto des3 = new Desconto();
					ObserverHortifruti oh3 = new ConcretoVerdura(des3);
					des3.setValorDescontoPorcentagem(escolha2);
					break;
				
				
				case 4: 
					System.out.println("Digite a porcentagem do valor de desconto: ");
					escolha2 = scan.nextDouble();
					Desconto des4 = new Desconto();
					ObserverHortifruti oh4 = new ConcretoVerdura(des4);
					ObserverHortifruti oh5 = new ConcretoFruta(des4);
					ObserverHortifruti oh6 = new ConcretoLegume(des4);
					des4.setValorDescontoPorcentagem(escolha2);
					break;

			}
		}while(escolha != 0);
		System.out.println("Fechando hortifruti...");
	}
	
	private static void mensagem() {
		System.out.println("\nAperte [0] para fechar o hortifruti");
		System.out.println("Aperte [1] para fornecer um desconto para as frutas");
		System.out.println("Aperte [2] para fornecer um desconto para os legumes");
		System.out.println("Aperte [3] para fornecer um desconto para as verduras");
		System.out.println("Aperte [4] para fornecer um desconto para todos os alimentos");
		System.out.print("\n--> ");
	}
}
