package br.com.unipar.poo.exemploheranca;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {}

    public String getNome() {
        return nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}
