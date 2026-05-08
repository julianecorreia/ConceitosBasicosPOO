package br.com.unipar.poo.exemplointerface;

public class Dinheiro implements Pagamento {

    //classe concreta que implementa a
    // interface Pagamento, ou seja,
    // é obrigada a implementar os
    // métodos da interface

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro no " +
                "valor de R$ " + valor);
    }

    @Override
    public String descreverPagamento() {
         return "Pagamento em dinheiro, " +
                "sem necessidade de cartão ou " +
                "dispositivo eletrônico.";
    }
}
