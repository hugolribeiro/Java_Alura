package teste;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.GuardadorGenerico;

public class TestaGuardadorGenerico {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22, 23);

        GuardadorGenerico guardadorGenerico = new GuardadorGenerico();

        guardadorGenerico.adiciona(cc);

        ContaPoupanca cp = new ContaPoupanca(53, 90);

        guardadorGenerico.adiciona(cp);

        for (int index=0; index < guardadorGenerico.getPosicaoLivre(); index ++){
            System.out.println(guardadorGenerico.getReferencias()[index]);
        }
    }




}
