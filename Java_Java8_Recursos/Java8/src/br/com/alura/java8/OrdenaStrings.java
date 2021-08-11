package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        // java 8
        palavras.sort(comparador);
        System.out.println(palavras);

        //Usando Lambda
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Usando Reference Method
        palavras.sort(Comparator.comparingInt(String::length));

        // antes do java 8
        for (String p: palavras){
            System.out.println(p);
        }

        // java 8
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

        // Classe anônima
        Consumer<String> consumidor2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // Função anônima (lambda)
        System.out.println("-------------LAMBDA FUNCTION-----------");
        palavras.forEach((s) -> System.out.println(s));

        // Reference Method
        System.out.println("-------------REFERENCE METHOD-----------");
        palavras.forEach(System.out::println);
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()){
            return -1;
        }
        if (s1.length() > s2.length()){
            return 1;
        }
        return 0;
    }
}
