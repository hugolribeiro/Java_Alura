package application;

import entities.Autenticavel;
import entities.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("25454652");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(500);;
		
		boolean autenticou = g1.autentica(500);

		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
