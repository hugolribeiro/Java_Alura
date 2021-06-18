package application;

import entities.Funcionario;
import entities.Gerente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario hugo = new Gerente();
		hugo.setNome("Hugo Ribeiro");
		hugo.setCpf("224142442134");
		hugo.setSalario(2600.00);
		
		System.out.println(hugo.getNome());
		System.out.println(hugo.getBonificacao());
	}

}
