package parte_2;

public class Funcionario {
	private String nome;
	private int idade;
	private float salario;

	public Funcionario(String nome, int idade, float salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		System.out.println(getNome() + " tem " + getIdade() + " anos e bonificação de R$" + bonificacao());
	}

	public double bonificacao() {
		return this.salario;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}	
}
