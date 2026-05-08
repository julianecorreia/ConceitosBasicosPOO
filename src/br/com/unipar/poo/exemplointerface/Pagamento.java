package br.com.unipar.poo.exemplointerface;

public interface Pagamento {

    //interface é um contrato, ou seja,
    //quem implementar a interface tem
    //que implementar os métodos da interface

    void pagar(double valor);
    String descreverPagamento();

}
