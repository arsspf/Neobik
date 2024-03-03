package org.example;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double[] banknotes = {100, 50, 20, 10, 5, 2};
        double[] MOEDAS = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for (double banknote : banknotes) {
            int quantity = (int) (N / banknote);
            N %= banknote;
            System.out.println(quantity + " nota(s) de R$ " + banknote);
        }
            System.out.println("MOEDAS:");
            for (double moedas : MOEDAS) {
                int quantity = (int) (N / moedas);
                N %= moedas;
                System.out.println(quantity + " moeda(s) de R$ " + moedas);
            }

        sc.close();
    }
}

