package org.example.nivel02_poo.Petshop;

public class PetShop {
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro();
        //dog1.nome = "Thor"; // aqui nao vai funcionar pq e private

        dog1.setNome("Thor");

        Cachorro dog2 = new Cachorro();

        //dog2.nome = "Mel";// aqui nao vai funcionar pq e private

        dog2.setNome("Mel");
        System.out.println("O nome do dog 1 é: " + dog1.getNome());
        System.out.println("O nome do dog 2 é: " + dog2.getNome());

        System.out.println(" ");
        System.out.print("Thor!, late...");
        dog1.latir();
        System.out.println(" ");
        System.out.print("Mel!, late...");
        dog2.latir();


        Gato meuGato = new Gato("Frajola", "Siames");

        // O método miar() é do Gato
        meuGato.miar();

        // O método comer() veio da Herança (do Pai Animal)
        meuGato.comer();
    }
}
