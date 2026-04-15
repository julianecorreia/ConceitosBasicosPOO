package br.com.unipar.poo.prova;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    /*
    1. cadastro de dois livros e dois alunos.
    2. realizar o empréstimo do primeiro livro para o primeiro aluno.
    3. o segundo aluno deverá tentar emprestar esse mesmo livro,
    devendo o sistema informar que a operação não pode ser concluída
    em razão da indisponibilidade do exemplar.
    4. o segundo aluno deverá realizar o empréstimo do segundo livro.
    5. apresentar na tela as informações dos livros, dos alunos e
    dos empréstimos efetuados.
    */

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setCodigo("01");
        livro1.setTitulo("Java para Iniciantes");
        livro1.setAutor("Rui Rossi");
        livro1.setDisponibilidade(Disponibilidade.DISPONIVEL);

        Livro livro2 = new Livro();
        livro2.setCodigo("02");
        livro2.setTitulo("Algoritmos e Lógica de Programação");
        livro2.setAutor("Edson Gonçalves");
        livro2.setDisponibilidade(Disponibilidade.DISPONIVEL);

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula("60005988");
        aluno1.setNome("Marcos Frota");
        aluno1.setCurso("ADS");

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula("60007896");
        aluno2.setNome("Maria Silva");
        aluno2.setCurso("Engenharia de Software");

        Emprestimo emprestimo1 = emprestimo(livro1, aluno1);
        emprestimo(livro1, aluno2);
        Emprestimo emprestimo2 = emprestimo(livro2, aluno2);

        System.out.println("Informações dos Emprestimos:\n");
        System.out.println("Empréstimo 1:");
        System.out.println("Livro: " + emprestimo1.getLivro().getTitulo());
        System.out.println("Aluno: " + emprestimo1.getAluno().getNome());
        System.out.println("Data: " + emprestimo1.getData());
        System.out.println("-------------------");
        System.out.println("Empréstimo 2:");
        System.out.println("Livro: " + emprestimo2.getLivro().getTitulo());
        System.out.println("Aluno: " + emprestimo2.getAluno().getNome());
        System.out.println("Data: " + emprestimo2.getData());

    }

    private static Emprestimo emprestimo(Livro livro,
                                           Aluno aluno) {
        if(livro.getDisponibilidade() != Disponibilidade.DISPONIVEL) {
            System.out.println("Livro indisponível para empréstimo.");
            return new Emprestimo();
        } else {
            livro.setDisponibilidade(Disponibilidade.INDISPONIVEL);

            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setAluno(aluno);
            emprestimo.setLivro(livro);

            emprestimo.setNumero(new Random().nextInt() + "");
            emprestimo.setData(LocalDate.now());
            emprestimo.setSituacao(Situacao.EMPRESTADO);

            System.out.println(
                    "Empréstimo do livro: " +
                            emprestimo.getLivro().getTitulo()
                    + " realizado com sucesso para o aluno: " +
                            emprestimo.getAluno().getNome());

            return emprestimo;
        }
    }


}
