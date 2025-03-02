package Operator_Intro;

import java.util.Scanner;

// Relational Operator or Comparison Operator

public class Relational {
    public static void main(String[] args) {
        System.out.print("[-] Insert A: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("[-] Insert B: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("A > B: " + (a>b));
        System.out.println("A < B: " + (a<b));
        System.out.println("A <= B: " + (a<=b));
        System.out.println("A >= B: " + (a>=b));
        System.out.println("A != B: " + (a!=b));
        System.out.println("A == B: " + (a==b));
    }
}
