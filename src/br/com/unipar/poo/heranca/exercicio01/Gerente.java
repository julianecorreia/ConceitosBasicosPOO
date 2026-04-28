package br.com.unipar.poo.heranca.exercicio01;

public class Gerente extends Funcionario {

    public Gerente() {
        super(); //chama o construtor da classe pai (Funcionario)
    }

    @Override //sobreescrever o metodo da classe pai (Funcionario)
    public void atividadesExecutadas() {
        System.out.println("Gerente gerencia!");
    }

}
