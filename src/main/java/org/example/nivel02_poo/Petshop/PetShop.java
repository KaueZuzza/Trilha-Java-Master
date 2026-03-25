package org.example.nivel02_poo.Petshop;

public class PetShop {
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro();
        dog1.nome = "Thor";

        Cachorro dog2 = new Cachorro();
        dog2.nome = "Mel";

        System.out.print("Thor!, late...");
        dog1.latir();
        System.out.println(" ");
        System.out.print("Mel!, late...");
        dog2.latir();
    }
}
