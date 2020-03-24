package br;


public class Carro {

	private String marca;
	private String placa;
	private int km;
	
	
	
	public Carro(String marca, String placa) {
		this.marca = marca;
		this.placa = placa;
		this.km = 0;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}

	public String verInfo() {
		return "Carro [marca=" + marca + ", placa=" + placa + ", km=" + km + "]";
	}
	
	
}
