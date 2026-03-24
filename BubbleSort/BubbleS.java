package BubbleSort;

import java.util.Arrays;

public class BubbleS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
