package br.com.byterbank.test.util;

import entities.Conta;
import entities.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        // Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int index = 0; index < lista.size(); index ++){
            System.out.println(lista.get(index));
        }

        System.out.println("----------------");

        for (Conta conta:
             lista) {
            System.out.println(conta);
        }

    }
}
