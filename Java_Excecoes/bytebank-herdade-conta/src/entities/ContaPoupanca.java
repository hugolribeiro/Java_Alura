package entities;

public class ContaPoupanca extends Conta{

	// dessa maneira usamos o construtor espec�fico da classe m�e, que trabalha com agencia e numero
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
