package br.com.unipar.poo.relacionamento.exercicio01;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;

    private Escola escola;

    public Aluno(String nome, String matricula, String curso, Escola escola) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.escola = escola;
    }

    public Aluno() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", escola=" + escola.getNome() +
                '}';
    }
}
