// package Recursion.E;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(Max(arr));
        }

        sc.close();
    }
    public static long Max(int[] arr) {
        Arrays.sort(arr);

        long sum1 = 0;
        long sum2 = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            long val = 1L << arr[i];
            
            if (sum1 <= sum2) {
                sum1 += val;
            } else {
                sum2 += val;
            }
        }

        return sum1 * sum2;
    }
}
