package br.com.unipar.poo.exemploheranca;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato("Miumiu");

        System.out.println("Gato criado: " + gato.getNome());

        gato.emitirSom();

        Cachorro cachorro = new Cachorro("Tiranossauro");

        System.out.println("Cachorro criado: " + cachorro.getNome());

        cachorro.emitirSom();
    }
}
