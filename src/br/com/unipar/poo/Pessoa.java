package br.com.unipar.poo;


import java.util.Date;

// classe é o mapa de como o objeto pessoa será
public class Pessoa {

    //atributos, sempre privados
    //atributos sempre aparecem primeiro,
    //1. sempre no topo da classe
    private String nome;
    private Date dataNascimento;
    private char sexo;
    private String cpf;

    private Pessoa conjuge;

    //2. construtores
    public Pessoa() { }

    //3. métodos
    //métodos de acesso
    //métodos acessores
    //getters "pega" o dado do atributo e manda
    //pra quem está solicitando
    public String getNome() {
        return nome;
    }

    //setters "insere" o valor no atributo
    //void significa que não tem retorno
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public String dormir() {
        return nome + " está dormindo.";
    }

    public String acordar() {
        return nome + " está acordando.";
    }

    public String conversar(Pessoa outraPessoa, String fala) {
        return nome + " está falando para " +
                outraPessoa.getNome() + ": " + fala;
    }

}
