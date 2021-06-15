package application;

import entities.Cliente;
import entities.Conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente hugo = new Cliente();
		hugo.nome = "Hugo Ribeiro";
		hugo.cpf = "231.312.999.999";
		hugo.profissao = "programador";
		
		Conta contaDoHugo = new Conta();
		// associa o cliente Hugo a conta do Hugo
		contaDoHugo.titular = hugo;
		contaDoHugo.deposita(500);
		System.out.println(contaDoHugo.titular.nome);
		
	}

}
