package model;

public class Aviao extends Veiculo {

	public Aviao(String marca, String modelo, String cor, String tipo, String uso) {
		super(marca, modelo, cor);

		this.tipo = tipo;
		this.uso = uso;
	}

	String tipo;
	public String uso;
}
