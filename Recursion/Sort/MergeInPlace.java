package Recursion.Sort;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        Merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void Merge(int[] arr, int s, int e) {
        if(e-s==1) return;
        int m = s+(e-s)/2;
        Merge(arr, s, m);
        Merge(arr, m, e);
        Merger(arr, s, m, e);
    }
    static void Merger(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int k=0;
        int i=s;
        int j=m;
        while(i<m & j<e) {
            if(arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        k=0;
        i=s;
        while(k<mix.length) {
            arr[i] = mix[k];
            i++;
            k++;
        }
    }
}
