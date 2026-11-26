package Contests.Codeforces.Round1137;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            long x = sc.nextLong();
            System.out.println(getFactor(x));
            t--;
        }
        sc.close();
    }
    public static String getFactor(long x) {
        if(x%2==0 && x%4!=0) {
            return "NO";
        }
        return "YES";
    }
}
