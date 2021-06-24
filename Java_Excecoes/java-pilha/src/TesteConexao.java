
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();		
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		// ------ o c�digo de cima � uma simplifica��o do c�digo de baixo --------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			con.close();
//		}
	}

}
