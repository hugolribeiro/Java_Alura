package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("232313123");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
