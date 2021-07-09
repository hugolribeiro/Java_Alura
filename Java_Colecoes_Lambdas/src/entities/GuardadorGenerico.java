package entities;

public class GuardadorGenerico {

    private Object[] referencias;
    private int posicaoLivre = 0;

    public GuardadorGenerico(){
        this.referencias = new Object[10];
    }

    public void adiciona(Object object){
        this.referencias[posicaoLivre] = object;
        this.posicaoLivre ++;
    }

    public Object[] getReferencias() {
        return referencias;
    }

    public int getPosicaoLivre() {
        return posicaoLivre;
    }
}
