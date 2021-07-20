package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Nico Steppat";

        // Transforma um objeto em binário
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();

        // Transforma um arquivo binário em caracter
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome2 = (String) ois.readObject();
        ois.close();

        System.out.println(nome2);
    }
}
