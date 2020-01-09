package default_package;

import java.util.Scanner;

import model.Carro;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro ("Renault","Kwid","laranja", 4, 1999);

		Scanner sc = new Scanner(System.in);
		String opcao;

		while (true) {
			opcao = sc.next();

			switch (opcao) {

			case "acelerar":
				carro.acelerar();
				break;

			case "frear":
				carro.frear();
				break;

			case "pintar":
				carro.pintar();
				break;

			case "ligar":
				carro.ligar();
				break;

			case "desligar":
				carro.desligar();
				break;

			case "abastecer":
				carro.abastecer();
				break;

			default:
				System.out.println("Escreva uma opção válida!");
				break;
			}
		}
	}
}