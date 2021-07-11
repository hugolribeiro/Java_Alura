package br.com.byterbank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); // unboxing

        Double dRef = Double.valueOf("3.2"); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Double.valueOf(29.9);
        System.out.println(refNumero.getClass());

        List<Number> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(68.98);
        listaNumeros.add(56.7f);

    }
}
