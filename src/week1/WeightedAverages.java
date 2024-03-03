package org.example;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double sum =0;
            for (int j = 0; j < 3; j++) {
                double number = sc.nextDouble();
                sum += number;
            }
            System.out.println(sum/3);
        }
    }
}
