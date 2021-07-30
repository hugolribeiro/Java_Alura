package br.com.alura;


public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString(){
        return "[Aula: " + this.getTitulo() + ", " + this.getTempo() + " minutos]";
    }

    //Comparar de acordo com o título
    @Override
    public int compareTo(Aula outraAula) {
        return this.getTitulo().compareTo(outraAula.getTitulo());
    }
}