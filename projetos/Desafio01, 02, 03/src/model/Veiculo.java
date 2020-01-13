package model;

import java.util.Scanner;

public class Veiculo {

	public Veiculo(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	private String marca, modelo, placa, cor;
	private int litrosCombustivel, velocidade;
	private float km;
	private double preco;
	private boolean isLigado;

	Scanner sc = new Scanner(System.in);

	public String getMarca() {

		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public void acelerar() {
		if (isLigado) {
			velocidade += 20;
			litrosCombustivel -= 1;
			if (litrosCombustivel == 0) {
				System.out.println("O combustivel acabou, o carro est� parando...");
				velocidade = 0;
				isLigado = false;
			} else if (velocidade >= 200) {
				if (velocidade == 200)
					System.out.println("Isto � uma Ferrari???");
				else
					System.out.println(
							"Calma aew cara!\nVoc� chegou na velocidade m�xima. Por acaso voc� est� b�bado???");
				velocidade = 200;
			} else
				System.out.println("Voc� est� a " + velocidade + "km/h.");
		} else
			System.out.println("N�o � poss�vel acelerar com o carro desligado!");

	}

	public void abastecer() {

		if (velocidade > 0) {
			System.out.println("N�o � poss�vel abastecer com o ve�culo em movimento");
		} else {
			System.out.println("Digite a quantidade de litros que voc� quer abastecer:");
			int qtdLitros = sc.nextInt();
			while (qtdLitros <= 0) {
				System.out.println("Cad� o combust�vel?\nDigite um novo valor:");
				qtdLitros = sc.nextInt();
			}
			while ((qtdLitros + litrosCombustivel) > 100) {
				System.out.println(
						"N�o foi poss�vel realizar o abastecimento, a capacidade total do tanque � de 100lts.\nVoc� pode abastecer mais "
								+ (100 - litrosCombustivel) + " litros.\nDigite um novo valor:");
				qtdLitros = sc.nextInt();
			}
			litrosCombustivel += qtdLitros;
			System.out.println("Voc� abasteceu " + qtdLitros + " litros. O tanque tem capacidade para mais "
					+ (100 - litrosCombustivel) + " litros.");
		}
	}

	public void frear() {
		if (isLigado && velocidade > 0) {
			velocidade -= 10;
			if (velocidade == 0)
				System.out.println("Voc� freou totalmente o carro!");
			else
				System.out.println("Voc� est� a " + velocidade + "km/h.");
		} else if (!isLigado)
			System.out.println("O carro n�o est� ligado!");
		else
			System.out.println("O carro n�o est� em movimento!");
	}

	public void pintar() {
		System.out.println("Escreva uma cor:");
		cor = sc.nextLine();
		System.out.println("Seu carro agora � " + cor + "!");
	}

	public void ligar() {
		if (isLigado && litrosCombustivel > 0)
			System.out.println("O carro j� est� ligado!");
		else {
			if (litrosCombustivel <= 0)
				System.out.println("N�o h� combust�vel.\nAbaste�a o carro!");
			else {
				isLigado = true;
				System.out.println("Voc� ligou o carro!");
			}
		}
	}

	public void desligar() {
		if (isLigado == false)
			System.out.println("O carro j� est� desligado!");
		else {
			isLigado = false;
			System.out.println("Voc� desligou o carro!");
		}
	}
}