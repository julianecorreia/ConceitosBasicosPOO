package br.com.unipar.poo.exercicio02;

import java.util.Scanner;

public class Main {

    //main + ctrl + espaço
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do Carro 1:");
        String marca = scanner.nextLine();
        carro1.setMarca(marca);

        System.out.println("Digite o modelo do Carro 1:");
        String modelo = scanner.nextLine();
        carro1.setModelo(modelo);

        System.out.println("Digite o ano do Carro 1:");
        int ano = scanner.nextInt();
        carro1.setAno(ano);

        System.out.println("Digite a marca do Carro 2:");
        String marca2 = scanner.nextLine();
        carro2.setMarca(marca2);

        System.out.println("Digite o modelo do Carro 2:");
        String modelo2 = scanner.nextLine();
        carro2.setModelo(modelo2);

        System.out.println("Digite o ano do Carro 2:");
        int ano2 = scanner.nextInt();
        carro2.setAno(ano2);

        System.out.println("Digite a marca do Carro 3:");
        String marca3 = scanner.nextLine();
        carro3.setMarca(marca3);

        System.out.println("Digite o modelo do Carro 3:");
        String modelo3 = scanner.nextLine();
        carro3.setModelo(modelo3);

        System.out.println("Digite o ano do Carro 3:");
        int ano3 = scanner.nextInt();
        carro3.setAno(ano3);
        
        System.out.println("Carro 1: " + carro1.toString());
        System.out.println("Carro 2: " + carro2.toString());
        System.out.println("Carro 3: " + carro3.toString());
    }
}
