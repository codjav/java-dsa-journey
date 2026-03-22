package BinarySearch.Questions;

public class SearInRotated {
    public static void main(String[] args) {
        int[] arr = {11,12,24,39,3,4,8,9,10};
        System.out.println(search(arr, 8));

    }

    static int search(int[] arr, int num) {
        int pivot = pivot(arr);
        int rotated = binary(arr, 0, pivot, num);
        if (rotated != -1) {
            return rotated;
        }else {
            int array = binary(arr, pivot+1, arr.length-1, num);
            if (array != -1) {
                return array;
            }else {
                return -1;
            }
        }
    }

    static int binary(int[] arr, int start, int end, int num) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == num) {
                return mid;
            }else if (arr[mid] < num) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int arrEnd = arr[arr.length-1];
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                return mid;
            }else if (arr[mid]<arrEnd) {
                end = mid-1;
            }else if (arr[mid]>arrEnd) {
                start = mid+1;
            }
        }
        return -1;
    }
}
