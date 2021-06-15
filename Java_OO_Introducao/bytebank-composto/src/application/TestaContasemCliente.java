package application;

import entities.Cliente;
import entities.Conta;

public class TestaContasemCliente {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		System.out.println(contaDoJoao.saldo);
		
		contaDoJoao.titular = new Cliente();
		System.out.println(contaDoJoao.titular);
		
		contaDoJoao.titular.nome = "Joao";
		System.out.println(contaDoJoao.titular.nome);
	}

}
