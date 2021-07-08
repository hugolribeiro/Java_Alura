package entities;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre = 0;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre ++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Conta getReferencia(int i) {
        return this.referencias[i];
    }
}
