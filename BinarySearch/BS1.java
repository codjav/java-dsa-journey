package BinarySearch;

public class BS1 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,10,13,16,28,35};
        System.out.println(binarysearch(arr, 0));
    }
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
