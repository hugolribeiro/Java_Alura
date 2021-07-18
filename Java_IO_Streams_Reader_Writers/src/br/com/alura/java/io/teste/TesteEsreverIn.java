package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEsreverIn {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; //new FileOutputStream("lorem4.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush(); // flush pois estamos usando o System.out
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
