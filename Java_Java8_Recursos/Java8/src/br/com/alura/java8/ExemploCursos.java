package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 133));
        cursos.add(new Curso("C", 55));

        // ordenar
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(c -> System.out.println(c.getNome()));

        // método stream com filter
        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .forEach(curso -> System.out.println(curso));

        // saber quantos alunos possuem em cada curso
        cursos.stream()
                    .map(Curso::getAlunos)
                    .filter(alunos -> alunos >= 100)
                    .forEach(System.out::println);

        // somar os alunos em cursos com mais de 100 alunos
        int sum = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(sum);

        // Optional ajuda a trabalhar com referências que podem ser null
        Optional<Curso> curso = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny();

    }
}
