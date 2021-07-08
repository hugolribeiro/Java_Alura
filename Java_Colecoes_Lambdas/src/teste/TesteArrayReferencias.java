package teste;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        // Criação de 5 REFERÊNCIAS ao objeto ContaCorrente. Mas não existem Contas ali dentro ainda
        Object[] referencias = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 11);
        referencias[1] = cc2;

        System.out.println(((Conta)referencias[1]).getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
