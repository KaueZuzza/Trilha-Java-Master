package org.example.nivel02_poo.Marca_Celular;

public class Celular {
    //o que o obj tem
    String marca;
    int bateria = 100;

    //o que o obj faz
    public void usarWhatsapp(){
        bateria -= 10;
        System.out.println("Usando Zap... Bateria agora: " + bateria + "%");
    }

    public void mostrarbateria(){
        System.out.println(bateria+"% de bateria");
    }
}
