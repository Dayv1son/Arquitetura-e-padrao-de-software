package state;

public interface State {
	//public State ligarTV();
	//public State desligarTV();
	//public State aumentarVolume();
	//public State diminuirVolume();
	//public State mutarVolume();
	//public State trocarCanal();
	
	public State ligarCarro();
	public State desligarCarro();
	public State acelerar();
	public State frear();
	public State fazerCurva();
	
	public void resultado();
}
