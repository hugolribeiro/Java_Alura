package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivo

        OutputStream fos = new FileOutputStream("lorem2.txt");

        // Transforma os bits e bytes do arquivo em caracteres
        Writer osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("TESTANDOOOO Lorem2");
        bw.newLine();
        bw.newLine();
        bw.write("Mais outro teste em outra linha");

        bw.close();
    }
}
