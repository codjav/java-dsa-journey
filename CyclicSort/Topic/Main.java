package CyclicSort.Topic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void cyclic(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            // int correct = arr[i]-1;
            if(arr[i] != i+1) {
                swap(arr, i, arr[i]-1);
            }else {
                i++;
            }
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


// When given number from range 1 to n