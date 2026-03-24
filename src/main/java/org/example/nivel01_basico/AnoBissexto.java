package org.example.nivel01_basico;
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é Bissexto.");
        } else {
            System.out.println(ano + " não é Bissexto.");
        }
        sc.close();
    }
}