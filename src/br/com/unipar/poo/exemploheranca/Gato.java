package br.com.unipar.poo.exemploheranca;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public Gato() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}
