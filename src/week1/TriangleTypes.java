package org.example;

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(),c = sc.nextDouble();
        double a2 = Math.pow(a, 2), b2 = Math.pow(b, 2),c2 = Math.pow(c, 2);
        if(a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if(a2 == b2+c2){
            System.out.println("TRIANGULO RETANGULO");
        }
        if(a2 > b2+c2){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(a2 < b2+c2){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && b ==c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(a == b & c !=b || c==b && a!=b || a==c && a!= b) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
