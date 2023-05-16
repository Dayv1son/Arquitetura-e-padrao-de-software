package photoshop;

public class EditorFoto {
	private String estado = "";
	
	public Memento criarMemento() {
		if(estado == "") {
			System.out.println("Nao foi feito nada para que seja salvo");
		}else {
			System.out.println("Salvou a alteração: "+estado);
		}
		return new Memento(estado);

	}
	
	
	public void setMemento(Memento m) {
		System.out.println("Recuperou o ultimo salvamento: "+m.getEstado()+" ");
		this.estado = m.getEstado();

		
	}
	
	public void brilho(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais brilho ";
		}else {
			this.estado += "Foto com menos brilho ";
		}
	}
	
	public void sombra(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais sombra ";
		}else {
			this.estado += "Foto com menos sombra ";
		}
	}
	
	public void nitidez(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais nitidez ";
		}else {
			this.estado += "Foto com menos nitidez ";
		}
	}
	
	public void saturacao(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais saturacao ";
		}else {
			this.estado += "Foto com menos saturacao ";
		}
	}
	
	public void contraste(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais contraste ";
		}else {
			this.estado += "Foto com menos contraste ";
		}
	}
	
	public void realce(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais realce ";
		}else {
			this.estado += "Foto com menos realce ";
		}
	}
	
	public void vibracao(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais vibracao ";
		}else {
			this.estado += "Foto com menos vibracao ";
		}
	}
	
	public void exposicao(boolean b) {
		if(b == true) {
			this.estado += "Foto com mais exposicao ";
		}else {
			this.estado += "Foto com menos exposicao ";
		}
	}
	
	public void filtro1() {
		this.estado += "Adicionando o filtro 1 para a foto ";
	}
	
	public void filtro2() {
		this.estado += "Adicionando o filtro 2 para a foto ";
	}
	
	public void filtro3() {
		this.estado += "Adicionando o filtro 3 para a foto ";
	}
	
}
