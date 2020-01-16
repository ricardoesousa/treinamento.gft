package parte_1;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Joao", 15));
		pessoas.add(new Pessoa("Leandro", 21));
		pessoas.add(new Pessoa("Paulo", 17));
		pessoas.add(new Pessoa("Jessica", 18));

		int maiorIdade = -1;
		String maisVelha = "";
		int idadeJessica = -1;

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() > maiorIdade) {
				maiorIdade = pessoas.get(i).getIdade();
				maisVelha = pessoas.get(i).getNome();
			}
		}
		
		System.out.println("A pessoa mais velha é: " + maisVelha);
		
		System.out.println("A lista possui " + pessoas.size() + " pessoas");

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() < 18 ) {
				pessoas.remove(i);
			}
		}
		
		System.out.println("Agora a lista possui " + pessoas.size() + " pessoas");
		
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getNome() == "Jessica") {
				idadeJessica = pessoas.get(i).getIdade();
			}
		}
		
		System.out.println("A Jessica está na lista e tem " + idadeJessica + " anos de idade");
	}
}
