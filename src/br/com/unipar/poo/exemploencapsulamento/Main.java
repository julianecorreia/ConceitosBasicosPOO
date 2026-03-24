package br.com.unipar.poo.exemploencapsulamento;

public class Main {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("João",
                new java.util.Date("01/01/2000"),
                "123.456.789-00",
                "12345678900");

        System.out.println(cliente.toString());

        System.out.println("Adicionando endereços...");


        Endereco endereco1 = new Endereco("Rua Atlantica",
                "123", null, "Centro", "05000-000",
                "Cascavel", "PR");

        cliente.getEnderecos().add(endereco1);

        Endereco endereco2 = new Endereco("Rua Brasilia",
                "456", "Casa", "Jardim", "06000-000",
                "Toledo", "PR");

        cliente.getEnderecos().add(endereco2);

        System.out.println(cliente.toString());

        Cliente conjuge = new Cliente("Maria",
                new java.util.Date("01/01/2000"),
                "987.654.321-00",
                "98765432100");

        cliente.setConjuge(conjuge);

        System.out.println("Com quem João casou? Com a " +
                cliente.getConjuge().getNome());

        Carro carro = new Carro("Chevrolet", "Onix", MotorEnum.MOTOR_1_4);

        cliente.setCarro(carro);

        System.out.println(cliente.getNome() +
                " comprou um " + cliente.getCarro().getModelo());

        System.out.println("O " + cliente.getCarro().getModelo() +
                " do " + cliente.getNome() + " tem um motor " +
                cliente.getCarro().getMotor().getDescricao());

    }
}
