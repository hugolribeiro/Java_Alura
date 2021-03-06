package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(250);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}
