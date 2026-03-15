package br.com.unipar.poo;

public class Main {

    public static void main(String[] args) {
        //aqui estou falando que ze da manga é um objeto
        //do tipo Pessoa, então ele vai ter todos os atributos
        //e métodos da classe Pessoa
        Pessoa zeDaManga = new Pessoa();
        zeDaManga.setNome("Zé da Manga");

        Pessoa mariazinha = new Pessoa();
        mariazinha.setNome("Mariazinha");

        String texto = zeDaManga.conversar(mariazinha, "Oi, quer tc?");
        System.out.println(texto);

        String texto2 = mariazinha.conversar(zeDaManga, "Não mesmo.");
        System.out.println(texto2);

        System.out.println(mariazinha.dormir());
    }
}
