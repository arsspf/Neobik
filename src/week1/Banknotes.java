package org.example;

import java.util.Scanner;

public class Banknotes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
            System.out.println("NOTAS:");
            for (int banknote : banknotes) {
                int quantity = N / banknote;
                N %= banknote;
                System.out.println(quantity + " nota(s) de R$ " + banknote+ ",00");
            }
            sc.close();
        }
    }

