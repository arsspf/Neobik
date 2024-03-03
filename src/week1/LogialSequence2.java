package org.example;

import java.util.Scanner;

public class LogialSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), x2 = sc.nextInt();
        int num = 0;
        for(int i = 1; i<=x2; i++){
            if(num%x1 == 0){
                System.out.println();
            }
            num++;
            System.out.print(i+ " ");
        }
    }
}
