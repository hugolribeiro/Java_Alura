package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
