package br.com.unipar.poo.exemplointerface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Venda venda = new Venda();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de vendas!");

        System.out.print("Digite o código da venda: ");
        venda.setCodigo(sc.nextLine());

        System.out.print("Digite a descrição da venda: ");
        venda.setDescricao(sc.nextLine());

        System.out.print("Digite o valor da venda: ");
        venda.setValor(sc.nextDouble());
        sc.nextLine();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Pix");

        switch (sc.nextInt()) {
            case 1:
                venda.setPagamento(new Dinheiro());
                break;
            case 2:
                venda.setPagamento(new Pix());
                break;
            default:
                System.out.println("Opção inválida. " +
                        "Usando pagamento em dinheiro por padrão.");
                venda.setPagamento(new Dinheiro());
        }

        venda.getPagamento().pagar(venda.getValor());

        System.out.println("\nResumo da Venda:");
        System.out.println("Código: " + venda.getCodigo());
        System.out.println("Descrição: " + venda.getDescricao());
        System.out.println("Valor: R$ " + venda.getValor());
        System.out.println("Pagamento: " + venda.getPagamento().descreverPagamento());
    }
}
