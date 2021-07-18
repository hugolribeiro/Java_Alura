package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");

        // Transforma os bits e bytes do arquivo em caracteres
        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
