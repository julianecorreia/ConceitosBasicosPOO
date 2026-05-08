package br.com.unipar.poo.exemplointerface;

public class Venda {

    private String codigo;
    private String descricao;
    private double valor;
    private Pagamento pagamento;

    public Venda(String codigo, String descricao, double valor, Pagamento pagamento) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Venda() { }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
