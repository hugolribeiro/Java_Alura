package entities;

import exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
	
	// dessa maneira usamos o construtor específico da classe mãe, que trabalha com agencia e numero
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		// O saque em conta corrente é taxado em 20 centavos
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		// 1 % do saldo
		return super.getSaldo() * 0.01;
	}

	@Override
	public String toString(){
		return "Conta Corrente, Numero: " + this.getNumero() + ", Agencia: " + this.getAgencia();
	}

}
