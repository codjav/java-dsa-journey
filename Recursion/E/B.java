package Recursion.E;

import java.util.Scanner;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int j=0; j<t; j++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int l = n-k;
            if(arr[n-k]==arr[n-k-1]) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
                for(int i=l; i<n; i++) {
                    System.out.print(arr[i]+" ");
                }
                for(int i=l-1; i>=0; i--) {
                    System.out.print(arr[i]+" ");
                }
            }
        }

        sc.close();
    }
}
