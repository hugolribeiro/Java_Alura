package entities;
// Gerente � um Funcion�rio, Gerente herda da class Funcionario e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
	public double getBonificacao() {
		//super quer dizer que pega m�todos e atributos da classe super (olha para cima)
		// bonificacao padr�o + sal�rio
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario();
	}
	
}
