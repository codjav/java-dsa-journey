package BinarySearch.RowColMatrix;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {12,22,32,42},
            {14,24,34,44},
            {16,26,36,46}
        };
        System.out.println(Arrays.toString(sear(arr, 34)));
    }
    static int[] sear(int[][] arr, int num) {
        int row = 0;
        int col = arr.length -1;

        while (row<arr.length && col>=0) {
            if (arr[row][col] == num) {
                return new int[] {row, col};
            }
            if (arr[row][col] < num) {
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
