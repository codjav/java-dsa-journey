package Recursion.Sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Selections(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int a = 0;
    private static void Selections(int[] arr, int e, int s) {
        if(e==0) return;
        if(s<e) {
            if(arr[a]<arr[s]) {
                a=s;
            }
            Selections(arr, e, s+1);
        }else {
            if(arr[a]>arr[s]) {
                int temp = arr[a];
                arr[a] = arr[s];
                arr[s] = temp;
            }
            a = 0;
            Selections(arr, e-1, 0);
        }
    }
}
