package br.com.unipar.poo.exercicio02;

//02. Crie uma classe chamada Carro com os
// atributos marca, modelo e ano.
//No metodo main, crie 3 objetos de Carro.
//Preencha os atributos de cada objeto.
//Exiba os dados no formato: Marca: X | Modelo: Y | Ano: Z.
public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() { }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                " | Modelo: " + modelo +
                " | Ano: " + ano;
    }
}
