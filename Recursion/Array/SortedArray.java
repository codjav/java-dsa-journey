package Recursion.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,3};
        boolean ans = Sorted(arr, 1, arr.length);
        System.out.println(ans);
    }
    private static boolean Sorted(int[] arr, int i, int n) {
        if(i>=n) return true;
        if(arr[i]<arr[i-1]) return false;
        return Sorted(arr, ++i, n);
    }
}
