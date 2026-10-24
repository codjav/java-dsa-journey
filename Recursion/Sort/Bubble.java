package Recursion.Sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,2,8,3};
        Bubbles(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    private static void Bubbles(int[] arr, int r, int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            if(arr[c]>arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Bubbles(arr, r, c+1);
        }else {
            Bubbles(arr, r-1, 0);
        }
    }
}
