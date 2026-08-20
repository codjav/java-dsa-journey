package SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int ind = 0;
            for(int j=0; j<arr.length-i; j++) {
                if(arr[j]>arr[ind]) {
                    ind = j;
                }
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[ind];
            arr[ind] = temp;
        }
    }
}
