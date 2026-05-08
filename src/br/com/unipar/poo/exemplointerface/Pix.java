package br.com.unipar.poo.exemplointerface;

public class Pix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via " +
                "Pix no valor de R$ " + valor);
    }

    @Override
    public String descreverPagamento() {
        return "Pix é um método de pagamento instantâneo " +
                "desenvolvido pelo Banco Central do Brasil.";
    }
}
