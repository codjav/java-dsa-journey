package LinearSearch;

public class RCW {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,4,6},
            {2,6,2},
            {9,4,2}
        };

        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int maxSum = 0;
        for (int[] is : arr) {
            int sum = 0;
            for (int is2 : is) {
                sum += is2;
            }
            if (maxSum<sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
