package br.com.unipar.poo.exemploheranca;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Gato("Miumiu");
        System.out.println("Gato criado: " + animal1.getNome());

        Animal animal2 = new Cachorro("Tiranossauro");
        System.out.println("Cachorro criado: " + animal2.getNome());

        animal1.emitirSom(); //polimorfismo
        animal2.emitirSom();
    }
}
