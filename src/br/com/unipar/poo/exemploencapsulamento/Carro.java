package br.com.unipar.poo.exemploencapsulamento;

public class Carro {

    private String marca;
    private String modelo;
    private MotorEnum motor; //o tipo desse atributo é uma enum
                             //não pode ser diferente de um dos valores
                             //da lista fixa

    public Carro() {
    }

    public Carro(String marca, String modelo, MotorEnum motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MotorEnum getMotor() {
        return motor;
    }

    public void setMotor(MotorEnum motor) {
        this.motor = motor;
    }
}
