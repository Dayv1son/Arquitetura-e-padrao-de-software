package hortifruti;
import java.util.ArrayList;
import java.util.List;

import alimentos.Fruta;
public class ConcretoFruta extends ObserverHortifruti{
	
	private Desconto desconto;
	List<Fruta> frutas;
	
	public ConcretoFruta(Desconto desconto) {
		this.desconto = desconto;
		desconto.adicionar(this);
		
		frutas = new ArrayList<Fruta>();
			
		Fruta f1 = new Fruta();
		f1.setNome("Maça");
		f1.setValor(5.00);
			
		Fruta f2 = new Fruta();
		f2.setNome("Banana");
		f2.setValor(4.50);
			
		Fruta f3 = new Fruta();
		f3.setNome("Uva");
		f3.setValor(8.99);
			
		frutas.add(f1);
		frutas.add(f2);
		frutas.add(f3);
		
	}


	@Override
	public void update() {
		System.out.println("\nDesconto de "+desconto.getValorDesconto()+"% aplicado sobre cada fruta:");
		
		for(Fruta f : frutas ) {			
			f.setValor(f.getValor()-f.getValor()*(desconto.getValorDesconto()/100));
			System.out.println(f.getNome()+": "+f.getValor());
		}
	}

}
