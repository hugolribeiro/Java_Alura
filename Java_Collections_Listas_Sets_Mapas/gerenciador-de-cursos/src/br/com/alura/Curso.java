package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal() + ","
                + "aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno a1) {
        this.alunos.add(a1);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }
}
