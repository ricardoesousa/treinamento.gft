package parte_2;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, float salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return super.bonificacao() + 5000.00;
	}
}
