package main;

public class Teste {
	
	public static void main(String[] args) {
		
		// As prioridades da Thread são constantes, então podemos definir usando Enums
		// Exemplos: estações do ano, status de um pedido
		
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
//		
//		Thread t = new Thread(() -> System.out.println("rodando ..."));
//		
//		t.setPriority(Thread.MAX_PRIORITY);
//		
//		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}

}
