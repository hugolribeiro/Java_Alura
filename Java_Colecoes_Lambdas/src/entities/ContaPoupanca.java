package entities;

public class ContaPoupanca extends Conta{

	// dessa maneira usamos o construtor específico da classe mãe, que trabalha com agencia e numero
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public String toString(){
		return "Conta Poupanca, Numero: " + this.getNumero() + ", Agencia: " + this.getAgencia();
	}

}
