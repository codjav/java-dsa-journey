package BinarySearch.RowColMatrix;

import java.util.Arrays;

public class BSinSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {12,14,16,18},
            {22,24,26,28},
            {32,34,36,38},
            {42,44,46,48}
        };
        System.out.println(Arrays.toString(rowFind(arr, 36)));
    }
    // Search in row found -
    static int[] binarySearch(int[][] arr, int num, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd-colStart)/2;
            if (arr[row][mid] == num) {
                return new int[]{row, mid};
            }else if (arr[row][mid] > num) {
                colEnd = mid-1;
            }else {
                colStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] rowFind(int[][] arr, int num) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) {
            return binarySearch(arr, num, 0, 0, cols-1);
        }

        // finding two last remaining rows -
        int rstart = 0;
        int rend = rows-1;
        int colmid = (cols-1)/2;

        while(rstart < (rend-1)) {
            int mid = rstart + (rend-rstart)/2;
            if (arr[mid][colmid] == num) {
                return new int[]{mid, colmid};
            }else if (arr[mid][colmid] < num) {
                rstart = mid;
            }else {
                rend = mid;
            }
        }

        // in the mid col -
        if (arr[rstart][colmid] == num) {
            return new int[]{rstart, colmid};
        }
        if (arr[rstart+1][colmid] == num) {
            return new int[]{rstart+1, colmid};
        }

        // in the first half -
        if (num <= arr[rstart][colmid-1]) {
            return binarySearch(arr, num, rstart, 0, colmid-1);
        }
        // in the second half -
        if (num >= arr[rstart][colmid+1] && num <= arr[rstart][cols-1]) {
            return binarySearch(arr, num, rstart, colmid+1, cols-1);
        }
        // in the third half -
        if (num <= arr[rstart+1][colmid-1]) {
            return binarySearch(arr, num, rstart+1, 0, colmid-1);
        }
        // in the fourth half -
        else {
            return binarySearch(arr, num, rstart+1, colmid+1, cols-1);
        }
    }
}
