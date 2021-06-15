package application;

import entities.Conta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoHugo = new Conta();
		contaDoHugo.saldo = 100;
		contaDoHugo.deposita(50);
		System.out.println(contaDoHugo.saldo);
		boolean conseguiuRetirar = contaDoHugo.saca(70);
		System.out.println(contaDoHugo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(1000);
		
		if (contaDoJoao.transfere(200, contaDoHugo)) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoJoao.saldo);
		System.out.println(contaDoHugo.saldo);
		
		contaDoHugo.titular = "Hugo Ribeiro";
		System.out.println(contaDoHugo.titular);
	}
}
