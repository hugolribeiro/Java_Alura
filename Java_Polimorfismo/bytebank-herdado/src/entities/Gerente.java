package entities;
// Gerente é um Funcionário, Gerente herda da class Funcionário
public class Gerente extends Funcionario{
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public double getBonificacao() {
		//super quer dizer que pega métodos e atributos da classe super (olha para cima)
		// bonificacao padrão + salário
		return super.getBonificacao() + super.getSalario();
	}
	
}
