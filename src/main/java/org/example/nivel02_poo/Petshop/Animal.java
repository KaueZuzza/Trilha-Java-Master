package org.example.nivel02_poo.Petshop;

public class Animal {
    // Usamos 'protected' para que os "filhos" possam ver, mas o resto não
    protected String nome;
    protected String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(nome + " está comendo...");
    }
}