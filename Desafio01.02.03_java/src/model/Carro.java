package model;

public class Carro extends Veiculo{
	public int portas, ano;
	

	public Carro(String marca, String modelo, String cor, int portas, int ano) {
		super(marca, modelo, cor);
		this.portas = portas;
		this.ano = ano;
	}
	
	
}
