package BinarySearch.Questions;

public class SplitArrLarSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int m = 2;

        System.out.println(splitArr(arr, m));
    }
    static int splitArr(int[] arr, int m) {
        int start = 0;
        int end = 0;
        
        for (int i : arr) {
            start = Math.max(start, i);
            end += i;
        }

        while (start<end) {
            int mid = start+ (end-start)/2;

            int sum = 0;
            int pieces = 1;

            for (int i : arr) {
                if (sum + i > mid) {
                    sum = i;
                    pieces += 1;
                }else {
                    sum += i;
                }
            }

            if (pieces <= m) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
