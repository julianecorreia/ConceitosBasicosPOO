package br.com.unipar.poo.heranca.exercicio01;

/*Uma empresa deseja testar um sistema simples para demonstrar
o papel de cada funcionário. Todos pertencem ao mesmo quadro
geral de funcionários, mas cada cargo executa suas atividades
de forma diferente.
No programa, crie dois funcionários de cargos diferentes:
um gerente e um vendedor. Ao exibir a atividade realizada
por cada um, o sistema deve mostrar mensagens diferentes
para cada cargo.
 */
public class Funcionario {

    private String nome;
    private String cargo;

    public Funcionario() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void atividadesExecutadas() {
        System.out.println("Funcionário trabalha!");
    }
}
