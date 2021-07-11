package br.com.byterbank.test.util;

import java.util.ArrayList;
import java.util.List;

// Vetor para lista

public class ArraysToList {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Carlos", "Joao", "Jose"};
        List<String> listaNomes = new ArrayList<>(java.util.Arrays.asList(nomes));
        System.out.println(listaNomes);
    }
}
