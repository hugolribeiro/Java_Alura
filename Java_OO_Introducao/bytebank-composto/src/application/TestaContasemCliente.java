package application;

import entities.Cliente;
import entities.Conta;

public class TestaContasemCliente {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		System.out.println(contaDoJoao.getSaldo());
		
		contaDoJoao.setTitular(new Cliente());
		System.out.println(contaDoJoao.getTitular());
		
		contaDoJoao.getTitular().setNome("Joao");
		System.out.println(contaDoJoao.getTitular().getNome());
	}

}
