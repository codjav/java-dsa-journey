package BinarySearch.MinimumPages;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int end = 0;

        long sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            end = Math.max(end, arr[i]);
        }

        int k = sc.nextInt();

        if(k>n || n==0) {
            System.out.println(-1);
            return;
        }else if(k==1) {
            System.out.println(sum);
            return;
        }

        long max = 0;

        long s = (long)end;
        long e = sum;
        while(s<=e) {
            long m = s+(e-s)/2;
            if(can(arr, m, k)) {
                max = m;
                e = m-1;
            }else {
                s = m+1;
            }
        }
        System.out.println(max);
    }
    static boolean can(int[] arr, long m, int k) {
        int count = 0;
        long last = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(last+arr[i] <= m) {
                last += arr[i];
            }else{
                last = arr[i];
                count++;
            }
        }
        count++;
        if(count<=k) return true;
        return false;
    }
}
