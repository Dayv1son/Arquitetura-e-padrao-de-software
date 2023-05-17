package hortifruti;
import java.util.ArrayList;
import java.util.List;

import alimentos.Legume;

public class ConcretoLegume extends ObserverHortifruti{
	private Desconto desconto;
	List<Legume> legumes;
	
	public ConcretoLegume(Desconto desconto) {
		this.desconto = desconto;
		desconto.adicionar(this);
		
		legumes = new ArrayList<Legume>();
			
		Legume l1 = new Legume();
		l1.setNome("Tomate");
		l1.setValor(3.66);
			
		Legume l2 = new Legume();
		l2.setNome("Cenoura");
		l2.setValor(4.00);
			
		Legume l3 = new Legume();
		l3.setNome("Batata");
		l3.setValor(2.50);
			
		legumes.add(l1);
		legumes.add(l2);
		legumes.add(l3);
		
	}


	@Override
	public void update() {
		System.out.println("\nDesconto de "+desconto.getValorDesconto()+"% aplicado sobre cada legume :");
		
		for(Legume l : legumes ) {			
			l.setValor(l.getValor()-l.getValor()*(desconto.getValorDesconto()/100));
			System.out.println(l.getNome()+": "+l.getValor());
		}
	}
}
