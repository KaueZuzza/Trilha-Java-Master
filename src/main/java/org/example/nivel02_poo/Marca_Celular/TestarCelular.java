package org.example.nivel02_poo.Marca_Celular;

public class TestarCelular {
    public static void main(String[] args){
        // Criando o primero obj (o celular)
        Celular meucelular = new Celular();
        meucelular.marca = "iphone";

        // Criando o segundo objeto (O celular da minha namorada, ali)
        Celular celularDaAli = new Celular();
        celularDaAli.marca = "Samsung";

        // Usando os objetos
        System.out.println("Meu celular é um: " + meucelular.marca);
        meucelular.usarWhatsapp();

        System.out.println("O celular da Ali é um: " + celularDaAli.marca);
        System.out.print("o celular da Ali esta com: "); celularDaAli.mostrarbateria();
    }
    }

