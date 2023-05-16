package principal;
import photoshop.EditorFoto;
import photoshop.SituacaoFoto;

public class Usuario {

	public static void main(String[] args) {
		EditorFoto e = new EditorFoto();
		SituacaoFoto s = new SituacaoFoto(e);
		
		
		e.brilho(true);
		e.nitidez(false);
		e.saturacao(true);
		
		s.salvarEstado();
		
		e.sombra(false);
		e.sombra(false);
		e.filtro2();
		
		s.salvarEstado();

		e.realce(true);
		e.vibracao(true);
		e.vibracao(true);
		
		s.salvarEstado();
		
		s.desfazerEstado();
		s.desfazerEstado();


		
	}

}
