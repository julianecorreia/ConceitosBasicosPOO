package br.com.unipar.poo.prova;

public class Figura {

    private double f;

    public Figura(double f) {
        this.f = f;
    }

    public Figura() {}

    public double calcf() {
        f = f * 3.1 * 2.5;
        return f;
    }

    public static void main(String[] args) {
        Figura shape = new Figura(10.3);
        double g;
        g = shape.calcf();
        System.out.println(g);
    }

}