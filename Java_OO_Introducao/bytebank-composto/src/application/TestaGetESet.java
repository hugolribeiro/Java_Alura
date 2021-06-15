package application;

import entities.Cliente;
import entities.Conta;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente hugo = new Cliente();
		hugo.setNome("Hugo Ribeiro");
		
		conta.setTitular(hugo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		
	}

}
