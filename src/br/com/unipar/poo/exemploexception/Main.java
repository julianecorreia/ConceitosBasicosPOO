package br.com.unipar.poo.exemploexception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Produto produto = new Produto("Notebook", -3500.00);
            System.out.println(produto.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        } finally {
            System.out.println("Finalizando o programa...");
        }

    }

    // comentado para evitar conflito com o exemplo de exceção personalizada
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Digite um número inteiro:");
//        int num1 = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Digite o segundo número inteiro:");
//        int num2 = sc.nextInt();
//        sc.nextLine();
//
//        try {
//            int resultado = dividir(num1, num2);
//            System.out.println("Resultado: " + resultado);
//        } catch (ArithmeticException e) {
//            System.out.println("Erro: Não pode dividir por zero. " + e.getMessage());
//        }
//
//        System.out.println("Finalizando o programa...");
//    }
//
//    public static int dividir(int num1, int num2) throws ArithmeticException {
//        return num1 / num2;
//    }


}
