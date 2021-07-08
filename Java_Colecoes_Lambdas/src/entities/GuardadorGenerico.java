package entities;

public class GuardadorGenerico {

    private Object[] referencias;
    private int posicaoAtual = 0;

    public GuardadorGenerico(){
        this.referencias = new Object[10];
    }
}
