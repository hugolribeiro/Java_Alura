package application;

import entities.Cliente;
import entities.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente hugo = new Cliente();
		hugo.setNome("Hugo Ribeiro");
		hugo.setCpf("231.312.999.999");
		hugo.setProfissao("programador");
		
		Conta contaDoHugo = new Conta();
		// associa o cliente Hugo a conta do Hugo
		contaDoHugo.setTitular(hugo);
		contaDoHugo.deposita(500);
		System.out.println(contaDoHugo.getTitular().getNome());
		
	}

}
