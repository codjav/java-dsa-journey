package BinarySearch.Questions;

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceil(arr, 15));
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if (target >= arr[end]) {
            return -1;
        }

        while (start<=end) {
            int mid = start + end-start/2;
            if (arr[mid] == target) {
                return arr[mid];
            }else if (target < arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
