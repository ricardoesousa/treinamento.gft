package model;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, String cor, int portas, int ano) {
		super(marca, modelo, cor);
		
		this.portas = portas;
		this.ano = ano;
		
	}
	
	public int portas, ano;
	
}
