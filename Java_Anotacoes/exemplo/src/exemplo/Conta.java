package exemplo;

public abstract class Conta {
	
	@DoublePositivo
	protected double saldo;
	private String titular;
	private String banco;
	private String agencia;
	private String numero;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}

}
