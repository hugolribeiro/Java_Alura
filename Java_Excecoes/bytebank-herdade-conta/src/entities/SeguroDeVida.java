package entities;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		//42 reais de imposto
		return 42;
	}

}
