package org.example.nivel02_poo.Petshop;

// Gato É UM Animal
public class Gato extends Animal {

    public Gato(String nome, String raca) {
        // O 'super' manda os dados lá para o construtor do Pai (Animal)
        super(nome, raca);
    }

    public void miar() {
        System.out.println(nome + " diz: Miau!");
    }
}