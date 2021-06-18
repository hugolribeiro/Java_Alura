package entities;

public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		//super quer dizer que pega métodos e atributos da classe super (olha para cima)
		// bonificacao padrão + 100 reais
		System.out.println("Chamando o método de bonificacao do Editor de Vídeo");
		return 150;
	}
	
}
