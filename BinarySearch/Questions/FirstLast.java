package BinarySearch.Questions;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7,8,9,10};
        System.out.println(Arrays.toString(postition(arr, 3)));
    }

    static int[] postition(int[] arr, int target) {
        int first, last;
        if (target<arr[0] || target>arr[arr.length-1]) {
            first = -1;
            last = -1;
        }else {
            first = first(arr, target);
            last = last(arr, target);
        }

        return new int[]{first, last};
    }

    static int first(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + end-start/2;
            if (target <= arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start;
    }

    static int last(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + end-start/2;
            if (target < arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return end;
    }
}
