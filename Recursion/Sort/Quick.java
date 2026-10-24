package Recursion.Sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        // * Choose a pivot.
        // * And after one pass every element lesser than pivot will be on left side and greater than pivot will be on right side.
        // * So pivot element will be at its sorted position.
        // * And use recursion till array get sorted.

        // * How to pick pivot - - - Pick always middle element as the pivot element
        
        int[] arr = {5,4,3,2,1};
        Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr, int l, int h) {
        if(l>=h) {
            return;
        }
        int s = l;
        int e = h;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while(s<e) {

            // * Reason why if arr is already sorted it will not sort like merge sort does
            while(arr[s]<pivot) {
                s++;
            }
            while(arr[e]>pivot) {
                e--;
            }
            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        Sort(arr, l, e);
        Sort(arr, s, h);
    }
}
