package br.com.unipar.poo.relacionamento.exercicio01;

public class Main {

    public static void main(String[] args) {
        Escola escola = new Escola("Escola do Parque",
                "Av. Sete de Setembro, 123 - Cascavel/PR");

        Aluno aluno1 = new Aluno("Zézinho",
                "1245", "Jardim da Infância", escola);
        Aluno aluno2 = new Aluno("Mariazinha", "8596", "Fundamental I",
                escola);

        escola.getAlunos().add(aluno1);
        escola.getAlunos().add(aluno2);

        System.out.println(escola.toString());
        System.out.println("----------------");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());

    }
}
