package Recursion.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Binary(arr, 0, 8, 10));
    }
    private static int Binary(int[] arr, int s, int e, int target) {
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return Binary(arr, s, mid-1, target);
        else return Binary(arr, mid+1, e, target);
    }
}
