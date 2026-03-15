package br.com.unipar.poo.exercicio01;

//ENUNCIADO
//01. Crie uma classe chamada Pessoa com os atributos
// nome e idade.
//No programa principal, crie 2 objetos da classe
// Pessoa.
//Atribua valores diferentes para cada objeto.
//Exiba os dados de cada pessoa.

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() { }

    @Override //aqui nessa classe, faça desse jeito
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
