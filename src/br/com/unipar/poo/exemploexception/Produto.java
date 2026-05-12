package br.com.unipar.poo.exemploexception;

public class Produto {

    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        if (preco < 0) {
            // Lança uma exceção personalizada para indicar que o preço é inválido
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }

        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
