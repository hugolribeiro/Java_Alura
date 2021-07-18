package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivo

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));
        bw.write("TESTANDOOOO Lorem2");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("Mais outro teste em outra linha");

        bw.close();
    }
}
