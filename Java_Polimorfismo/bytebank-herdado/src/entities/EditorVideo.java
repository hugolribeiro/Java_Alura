package entities;

public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		//super quer dizer que pega m�todos e atributos da classe super (olha para cima)
		// bonificacao padr�o + 100 reais
		System.out.println("Chamando o m�todo de bonificacao do Editor de V�deo");
		return 150;
	}
	
}
