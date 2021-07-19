package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWrite {

    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));

//        PrintStream ps = new PrintStream("lorem6.txt");

        PrintWriter ps = new PrintWriter("lorem7.txt");
        ps.println("Testandooooo");

        ps.println();
        ps.println("Mais uma linha de teste");

        ps.close();

    }
}
