package br.com.unipar.poo.exemplointerface2;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Shape square = new Square(4, 4);
        System.out.println("Area of Square: " + square.area());

        Shape triangle = new Triangle(3, 6);
        System.out.println("Area of Triangle: " + triangle.area());

    }
}
