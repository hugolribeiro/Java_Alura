
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		// o char guarda dentro dele um n?mero da tabela Unicode e transforma para caracter
		
		char valor = 66;
		System.out.println(valor);
		
		valor += 1;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String frase = "alura cursos online de tecnologia";
		System.out.println(frase);
		
		// O operador '+' ? usado para concatenar strings
		frase = frase + 2020;
		System.out.println(frase);
		
	}

}
