package Contests.Codeforces.Round1134;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int[] arr1 = new int[n];
            int i=0;
            int j=n-1;
            int k=0;
            while(i<=j) {
                if(i==j) {
                    arr1[i] = arr[k];
                }else {
                    arr1[i] = arr[k];
                    arr1[j] = arr[k+1];
                }
                k+=2;
                i++;
                j--;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(visibleCount(arr1)).append("\n");
            for(i=0; i<n; i++) {
                sb.append(arr1[i]).append(i == n - 1 ? "" : " ");
            }
            System.out.println(sb);
            System.out.println();
            t--;
        }
        sc.close();
    }
    public static int visibleCount(int[] arr) {
        int count = 0;
        int n=arr.length;
        int max = 0;
        boolean[] bool = new boolean[n];

        for(int i=0; i<n; i++) {
            if(arr[i]>max) {
                bool[i] = true;
                max = arr[i];
            }
        }
        max = 0;
        for(int i=n-1; i>=0; i--) {
            if(arr[i]>max) {
                bool[i] = true;
                max = arr[i];
            }
        }
        for(boolean i:bool) {
            if(i) {
                count++;
            }
        }
        return count;
    }
}
