package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        // Para cada String aula dentro de aulas faça...
        for (String aula:
             aulas) {
            System.out.println("Aula: " + aula);
        }


        // loop com conceito de index e tamanho da lista
        for (int i=0; i < aulas.size(); i ++){
            System.out.println("Aula: " + aulas.get(i));
        }

        // Usando lambda - Para cada aula dentro de aula faça (->) System.out.println
        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("Aula " + aula);
        });

        System.out.println("---------------------");
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        System.out.println("-------Ordenando a lista-------");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
