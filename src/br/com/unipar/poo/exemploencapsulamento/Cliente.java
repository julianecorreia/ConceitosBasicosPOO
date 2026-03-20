package br.com.unipar.poo.exemploencapsulamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String cnh;

    private List<Endereco> enderecos = new ArrayList<>();

    private Cliente conjuge;

    //TODO lista de telefone
    //TODO carro

    public Cliente(String nome,
                   Date dataNascimento,
                   String cpf,
                   String cnh) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Cliente getConjuge() {
        return conjuge;
    }

    public void setConjuge(Cliente conjuge) {
        this.conjuge = conjuge;
    }

    @Override
    public String toString() {
        String texto = "Cliente [nome=" + nome + ", " +
                "dataNascimento=" + dataNascimento
                + ", cpf=" + cpf + ", " +
                "cnh=" + cnh + "]";

        for (Endereco endereco : enderecos) {
            texto += "\nEndereco [logradouro=" + endereco.getLogradouro() + ", " +
                    "numero=" + endereco.getNumero() + ", " +
                    "complemento=" + endereco.getComplemento() + ", " +
                    "bairro=" + endereco.getBairro() + ", " +
                    "cep=" + endereco.getCep() + ", " +
                    "cidade=" + endereco.getCidade() + ", " +
                    "estado=" + endereco.getEstado() + "]";
        }

        return texto;
    }
}
