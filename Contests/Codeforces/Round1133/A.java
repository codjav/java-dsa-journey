package Contests.Codeforces.Round1133;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int j=0; j<t; j++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for(int i=0; i<n; i++) {
                b[i] = sc.nextInt();
            }
            boolean ans = Ans(n, k, a, b);
            if(ans) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
    public static boolean Ans(int n, int k, int[] a, int[] b) {
        int oddA = 0;
        for(int i:a) {
            if((i&1)==1) {
                oddA++;
            }
        }
        int oddB = 0;
        for(int i:b) {
            if((i&1)==1) {
                oddB++;
            }
        }
        if(oddA==oddB) return true;
        else if(oddA>oddB) {
            if((k&1)==0) return true;
            return false;
        }else {
            if((k&1)==1) return true;
            return false;
        }
    }
}
