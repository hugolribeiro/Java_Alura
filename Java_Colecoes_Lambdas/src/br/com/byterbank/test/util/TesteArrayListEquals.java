package br.com.byterbank.test.util;

import entities.Conta;
import entities.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        // Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);

        boolean existe = lista.contains(cc3);

        System.out.println(" Já existe? " + existe);

        for(Conta conta: lista){
            if(conta == cc3){
                System.out.println(" Ja tenho essa conta");
            }
        }

        System.out.println(cc2.equals(cc3));

        for (Conta conta:
             lista) {
            System.out.println(conta);
        }
    }
}
