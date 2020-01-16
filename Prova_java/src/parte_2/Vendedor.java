package parte_2;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, float salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 3000.00;
	}
}
