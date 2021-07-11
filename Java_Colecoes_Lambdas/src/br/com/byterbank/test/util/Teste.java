package br.com.byterbank.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;
        List numeros = new ArrayList();
        numeros.add(idade); // O java faz o processo de Autoboxing (transformação de um primitivo para uma referência)

        Integer idadeRef = Integer.valueOf(idade); // método que cria um objeto a partir de um tipo primitivo - Autoboxing

        int valor = idadeRef.intValue();  // método que pega o tipo primitivo a partir de um objeto - Unboxing


        String s = "10";
        Integer numero = Integer.valueOf(s);
        System.out.println(numero.getClass());

        int numero1 = Integer.parseInt(s);
        System.out.println(numero1);
    }
}
