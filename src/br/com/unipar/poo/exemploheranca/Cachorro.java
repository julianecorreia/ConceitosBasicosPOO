package br.com.unipar.poo.exemploheranca;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
