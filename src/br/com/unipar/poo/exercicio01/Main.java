package br.com.unipar.poo.exercicio01;

//No programa principal, crie 2 objetos da classe
// Pessoa.
//Atribua valores diferentes para cada objeto.
//Exiba os dados de cada pessoa.

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 24);
        Pessoa pessoa2 = new Pessoa("João", 22);

        System.out.println("Pessoa 1: " + pessoa1.toString());
        System.out.println("Pessoa 2: " + pessoa2.toString());
    }
}