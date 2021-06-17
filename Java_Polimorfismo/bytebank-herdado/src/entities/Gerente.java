package entities;
// Gerente � um Funcion�rio, Gerente herda da class Funcion�rio
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
		//super quer dizer que pega m�todos e atributos da classe super (olha para cima)
		// bonificacao padr�o + sal�rio
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
	
}
