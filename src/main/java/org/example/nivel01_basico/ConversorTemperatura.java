package org.example.nivel01_basico;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius");
        int op = sc.nextInt();
        System.out.print("Temperatura: ");
        double temp = sc.nextDouble();

        if (op == 1) System.out.println("Resultado: " + ((temp * 9/5) + 32) + "°F");
        else System.out.println("Resultado: " + ((temp - 32) * 5/9) + "°C");
        sc.close();
    }
}