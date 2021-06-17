package entities;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
//	public Conta() {
//		
//	}
	
	public Conta(int agencia, int numero) {
		totalDeContas++;
//		System.out.println("O total de contas é: " + Conta.totalDeContas);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("estou criando uma conta " + this.numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;	
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor <= a 0");
			return;
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
}
