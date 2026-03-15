package br.com.unipar.poo.exercicio10;

import java.util.Scanner;

//10. Crie uma classe chamada Carrinho com os
// atributos privados quantidadeItens e valorTotal.
//Implemente os métodos getQuantidadeItens, getValorTotal,
// adicionarItem(double preco), removerItem(double preco) e aplicarDesconto(double percentual).
//Respeite as seguintes regras:
// - o preco deve ser maior que zero;
// - não remova item se o carrinho estiver vazio;
// - não permita valorTotal negativo;
// - o percentual de desconto deve estar entre 0 e 100.
//No metodo main, simule adição de itens, remoção, aplicação de desconto e exiba um
// resumo final do carrinho.
public class Main {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        System.out.println("Carrinho Aberto! Vamos gastar!\n" +
                "Digite <add> para adicionar item, " +
                "<remove> para remover item, " +
                "<desconto> para aplicar desconto," +
                "<imprimir> para imprimir o carrinho e " +
                "<sair> para finalizar compra.");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            switch (scanner.nextLine()) {
                case "add":
                    System.out.println("Digite o preço do item a ser adicionado:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(carrinho.adicionarItem(preco));
                    break;
                case "remove":
                    //TODO implementar remoção de item
                    break;
                case "desconto":
                    //TODO implementar aplicação de desconto
                    break;
                case "imprimir":
                    carrinho.imprimir();
                    break;
                case "sair":
                    return; // Encerra o programa
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
            //TODO implementar a validação de não permita valorTotal negativo
        }

    }
}
