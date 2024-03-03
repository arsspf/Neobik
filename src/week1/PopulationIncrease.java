package org.example;

import java.util.Scanner;

public class PopulationIncrease {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int PA = scanner.nextInt(); // Population of city A
            int PB = scanner.nextInt(); // Population of city B
            double G1 = scanner.nextDouble(); // Growth rate of city A
            double G2 = scanner.nextDouble(); // Growth rate of city B

            int years = 0;

            // Calculate how many years it takes for city A to surpass city B
            while (PA <= PB) {
                PA += (int) (PA * (G1 / 100));
                PB += (int) (PB * (G2 / 100));
                years++;

                // If it takes more than 100 years, print "Mais de 1 seculo" and break
                if (years > 100) {
                    System.out.println("Mais de 1 seculo");
                    break;
                }
            }

            // If less than 100 years, print the number of years
            if (years <= 100) {
                System.out.println(years + " anos");
            }
        }
    }
}