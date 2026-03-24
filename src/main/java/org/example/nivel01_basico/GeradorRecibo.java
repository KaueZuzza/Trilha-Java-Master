package org.example.nivel01_basico;

import java.util.Scanner;

public class GeradorRecibo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SISTEMA DE EMISSÃO DE RECIBOS ===");

        System.out.print("Nome do Cliente: ");
        String cliente = leitor.nextLine();

        System.out.print("Serviço Prestado: ");
        String servico = leitor.nextLine();

        System.out.print("Valor do Serviço: R$ ");
        double valor = leitor.nextDouble();

        // Gerando o recibo formatado
        System.out.println("\n-------------------------------------------");
        System.out.println("             RECIBO DE PAGAMENTO           ");
        System.out.println("-------------------------------------------");
        System.out.println("Recebemos de: " + cliente.toUpperCase());
        System.out.println("A quantia de: R$ " + String.format("%.2f", valor));
        System.out.println("Referente a: " + servico);
        System.out.println("-------------------------------------------");
        System.out.println("Data: 24/03/2026 | Assinatura: ____________");
        System.out.println("-------------------------------------------");

        leitor.close();
    }
}