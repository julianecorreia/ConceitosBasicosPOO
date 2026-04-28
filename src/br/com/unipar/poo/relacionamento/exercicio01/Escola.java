package br.com.unipar.poo.relacionamento.exercicio01;

/*Uma escola está organizando seu sistema interno
para registrar estudantes. O programa deve
representar a situação em que uma escola possui
um aluno matriculado e precisa exibir essas
informações na tela.

Cadastre uma escola com nome definido pelo usuário
e associe a ela um aluno com nome e idade também
definidos pelo usuário. Ao final, exiba uma
mensagem contendo o nome da escola e os dados
do aluno matriculado.
*/

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private String endereco;

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Escola() { }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        String retorno = "";
        retorno += "Nome: " + nome + "\n";
        retorno += "Endereco: " + endereco + "\n";
        for (Aluno aluno : alunos) {
            retorno += "Aluno: "  + aluno.getMatricula() + " - "
                    + aluno.getNome() + "\n";
        }

        return retorno;
    }
}
