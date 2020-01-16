package parte_2;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, float salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		 return super.bonificacao() + 10000.00;
	}	
}


