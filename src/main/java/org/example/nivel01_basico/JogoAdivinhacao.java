package org.example.nivel01_basico;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int segredo = (int) (Math.random() * 10) + 1;
        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.println("Adivinhe o número de 1 a 10!");
        while (palpite != segredo) {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();
            if (palpite != segredo) System.out.println("Errado! Tente de novo.");
        }
        System.out.println("Parabéns! Você acertou.");
        sc.close();
    }
}