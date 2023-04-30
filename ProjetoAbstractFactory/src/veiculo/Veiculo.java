package veiculo;

public class Veiculo {
	private String marca;
	private String cor;
	private String tipoVeiculo; //moto, carro, caminhão, etc
	private int kilometragem;
	private double preco;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public int getKilometragem() {
		return kilometragem;
	}
	
	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
