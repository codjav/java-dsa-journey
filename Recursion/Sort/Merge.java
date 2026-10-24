package Recursion.Sort;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        arr = Merger(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Merger(int[] arr) {
        if(arr.length==1) return arr;
        
        int mid = arr.length/2;
        int[] left = Merger(Arrays.copyOfRange(arr, 0, mid));
        int[] right = Merger(Arrays.copyOfRange(arr, mid, arr.length));

        return mergen(left, right);
    }
    static int[] mergen(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int l=0;
        int r=0;
        int k=0;
        while(l<left.length && r<right.length) {
            if(left[l]<=right[r]) {
                mix[k] = left[l];
                l++;
            }else {
                mix[k] = right[r];
                r++;
            }
            k++;
        }

        while(r<right.length) {
            mix[k] = right[r];
            r++;
            k++;
        }
        while(l<left.length) {
            mix[k] = left[l];
            l++;
            k++;
        }

        return mix;
    }
}
