import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Input here a word or number: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String reverse = "";
		int lengthA = a.length();
		char[] characters = a.toCharArray();
		for(int index=(lengthA-1); index >= 0; index --) {
			reverse += characters[index];
		}
		System.out.println(reverse);
		if (a.equals(reverse)) {
			System.out.println("É palíndromo");
		}else {
			System.out.println("Não é palíndromo");
		}
		sc.close();
	}
}
