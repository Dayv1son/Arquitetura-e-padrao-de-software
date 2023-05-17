package hortifruti;
import java.util.ArrayList;
import java.util.List;

import alimentos.Verdura;

public class ConcretoVerdura extends ObserverHortifruti {
	private Desconto desconto;
	List<Verdura> verduras;
	
	public ConcretoVerdura(Desconto desconto) {
		this.desconto = desconto;
		desconto.adicionar(this);
		
		verduras = new ArrayList<Verdura>();
			
		Verdura v1 = new Verdura();
		v1.setNome("Alface");
		v1.setValor(2.79);
			
		Verdura v2 = new Verdura();
		v2.setNome("Espinafre");
		v2.setValor(3.15);
			
		Verdura v3 = new Verdura();
		v3.setNome("Brocolis");
		v3.setValor(6.88);
			
		verduras.add(v1);
		verduras.add(v2);
		verduras.add(v3);
		
	}


	@Override
	public void update() {
		System.out.println("\nDesconto de "+desconto.getValorDesconto()+"% aplicado sobre cada Verdura :");
		
		for(Verdura v : verduras ) {			
			v.setValor(v.getValor()-v.getValor()*(desconto.getValorDesconto()/100));
			System.out.println(v.getNome()+": "+v.getValor());
		}
	}
}
