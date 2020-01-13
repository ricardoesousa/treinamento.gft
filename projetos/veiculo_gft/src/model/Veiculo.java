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
				System.out.println("O combustivel acabou, o carro está parando...");
				velocidade = 0;
				isLigado = false;
			} else if (velocidade >= 200) {
				if (velocidade == 200)
					System.out.println("Isto é uma Ferrari???");
				else
					System.out.println(
							"Calma aew cara!\nVocê chegou na velocidade máxima. Por acaso você está bêbado???");
				velocidade = 200;
			} else
				System.out.println("Você está a " + velocidade + "km/h.");
		} else
			System.out.println("Não é possível acelerar com o carro desligado!");

	}

	public void abastecer() {

		if (velocidade > 0) {
			System.out.println("Não é possível abastecer com o veículo em movimento");
		} else {
			System.out.println("Digite a quantidade de litros que você quer abastecer:");
			int qtdLitros = sc.nextInt();
			while (qtdLitros <= 0) {
				System.out.println("Cadê o combustível?\nDigite um novo valor:");
				qtdLitros = sc.nextInt();
			}
			while ((qtdLitros + litrosCombustivel) > 100) {
				System.out.println(
						"Não foi possível realizar o abastecimento, a capacidade total do tanque é de 100lts.\nVocê pode abastecer mais "
								+ (100 - litrosCombustivel) + " litros.\nDigite um novo valor:");
				qtdLitros = sc.nextInt();
			}
			litrosCombustivel += qtdLitros;
			System.out.println("Você abasteceu " + qtdLitros + " litros. O tanque tem capacidade para mais "
					+ (100 - litrosCombustivel) + " litros.");
		}
	}

	public void frear() {
		if (isLigado && velocidade > 0) {
			velocidade -= 10;
			if (velocidade == 0)
				System.out.println("Você freou totalmente o carro!");
			else
				System.out.println("Você está a " + velocidade + "km/h.");
		} else if (!isLigado)
			System.out.println("O carro não está ligado!");
		else
			System.out.println("O carro não está em movimento!");
	}

	public void pintar() {
		System.out.println("Escreva uma cor:");
		cor = sc.nextLine();
		System.out.println("Seu carro agora é " + cor + "!");
	}

	public void ligar() {
		if (isLigado && litrosCombustivel > 0)
			System.out.println("O carro já está ligado!");
		else {
			if (litrosCombustivel <= 0)
				System.out.println("Não há combustível.\nAbasteça o carro!");
			else {
				isLigado = true;
				System.out.println("Você ligou o carro!");
			}
		}
	}

	public void desligar() {
		if (isLigado == false)
			System.out.println("O carro já está desligado!");
		else {
			isLigado = false;
			System.out.println("Você desligou o carro!");
		}
	}
}