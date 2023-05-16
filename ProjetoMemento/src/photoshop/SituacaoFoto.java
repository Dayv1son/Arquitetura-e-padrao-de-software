package photoshop;
import java.util.Stack;

public class SituacaoFoto {

	private Stack<Memento> estados = new Stack<Memento> ();
	
	private EditorFoto editor;
	
	public SituacaoFoto(EditorFoto editor) {
		this.editor = editor;
	}
	
	public void salvarEstado() {
		estados.push(editor.criarMemento());
	}
	
	public void desfazerEstado() {
		editor.setMemento(estados.pop());
	}
	
}
