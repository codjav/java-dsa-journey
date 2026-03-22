package BinarySearch.Questions;

public class PeakMount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        int a = peak(arr);
        System.out.println(a);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if (mid < arr.length-1 && arr[mid] < arr[mid+1]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
