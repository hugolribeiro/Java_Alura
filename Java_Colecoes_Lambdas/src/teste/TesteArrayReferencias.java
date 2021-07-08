package teste;

import entities.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        // Criação de 5 REFERÊNCIAS ao objeto ContaCorrente. Mas não existem Contas ali dentro ainda
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);

        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 11);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());


    }
}
