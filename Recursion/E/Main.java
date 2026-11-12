package Recursion.E;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(Count(l, r));
        }
        sc.close();
    }
    public static int Count(int l, int r) {
        if(l==-r) {
            return 0;
        }
        if(l==r) {
            return 0;
        }else if(l==0) {
            return r-1;
        }else if(l>0) {
            return r-l;
        }else if(r==0) {
            return -1*(l+1);
        }else if(r<0) {
            return -1*(l-r);
        }else {
            if(Math.abs(l)>r) {
                return Math.abs(l)-r-1;
            }else {
                return r+l-1;
            }
        }
    }
}
