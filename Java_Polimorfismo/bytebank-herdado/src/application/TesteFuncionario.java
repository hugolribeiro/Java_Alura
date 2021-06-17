package application;

import entities.Funcionario;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario hugo = new Funcionario();
		hugo.setNome("Hugo Ribeiro");
		hugo.setCpf("224142442134");
		hugo.setSalario(2600.00);
		
		System.out.println(hugo.getNome());
		System.out.println(hugo.getBonificacao());
	}

}
