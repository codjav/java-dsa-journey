// package Recursion.E;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            System.out.println(MaxProduct(n));
        }

        sc.close();
    }
    public static int MaxProduct(int n) {
        int a = n/2;
        int b = n-a;
        return a*b;
    }
}
