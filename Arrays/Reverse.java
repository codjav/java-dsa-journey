package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return arr;
    }
    static void swap(int[] arr, int ind1, int ind2) {
        int tem = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tem;
    }
}
