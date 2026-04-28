package br.com.unipar.poo.heranca.exercicio01;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Zé da Manga");
        gerente.setCargo("Gestor");

        gerente.atividadesExecutadas();

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Vendedor");
        vendedor.atividadesExecutadas();

    }
}
