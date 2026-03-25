package org.example.nivel01_basico;
import java.util.Scanner;

public class TabuadaDinamica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quer a tabuada de qual número? ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}