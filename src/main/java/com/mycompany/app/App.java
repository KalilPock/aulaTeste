package com.mycompany.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        double[] precos = new double[quantidadeProdutos];
        double totalCompra = 0.0;

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Informe o preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            totalCompra += precos[i]; // Acumula o total da compra
        }

        System.out.println("Preço total da compra:");
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto " + (i + 1) + ": " + precos[i]);
        }

        System.out.println("O total da compra é: " + totalCompra); // Exibe o total da compra

        scanner.close();
    }
}
