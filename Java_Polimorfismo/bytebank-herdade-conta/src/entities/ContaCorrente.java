package entities;

public class ContaCorrente extends Conta implements Tributavel{
	
	// dessa maneira usamos o construtor espec�fico da classe m�e, que trabalha com agencia e numero
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		// O saque em conta corrente � taxado em 20 centavos
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		// 1 % do saldo
		return super.getSaldo() * 0.01;
	}

}
