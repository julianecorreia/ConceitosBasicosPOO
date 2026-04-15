package br.com.unipar.poo.prova;

/*sistema simples de controle de empréstimo de livros

ok Livro: código, título, autor e situação de disponibilidade;
ok Aluno: matrícula, nome e curso;
ok Emprestimo: número, data, situação do empréstimo, Livro e Aluno.

*/

public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private Disponibilidade disponibilidade;

    public Livro() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
