package org.example.nivel01_basico;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.println(n + " é PAR.");
        else System.out.println(n + " é ÍMPAR.");
        sc.close();
    }
}