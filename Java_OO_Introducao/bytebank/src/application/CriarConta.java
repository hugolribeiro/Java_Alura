package application;

import entities.Conta;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		}
		else {
			System.out.println("São contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
