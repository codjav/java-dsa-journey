package Recursion.Array;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4};
        int target = 9;
        int ans = BS(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
    private static int BS(int[] arr, int target, int s, int e) {
        if(s>e) return -1;

        int m = s+(e-s)/2;
        if(arr[m]==target) return m;

        if(arr[m]>=arr[s]) {
            if(target>=arr[s] && target<=arr[m]) {
                return BS(arr, target, s, m);
            }else {
                return BS(arr, target, m+1, e);
            }
        }

        if(target>=m && target<=arr[e]) {
            return BS(arr, target, m, e);
        }

        return BS(arr, target, s, m-1);
    }
}
