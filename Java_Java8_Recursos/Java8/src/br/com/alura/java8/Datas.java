package br.com.alura.java8;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadaFranca = LocalDate.of(2024, Month.JUNE, 5);

        int anos = olimpiadaFranca.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadaFranca);
        System.out.println(periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadaFranca.plusYears(4);

        System.out.println(proximasOlimpiadas);

        // Formatando uma data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximasOlimpiadas.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatador));

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        Instant instant = Instant.now();
        System.out.println(instant);

    }
}
