package BinarySearch.SmallerThanMe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    int[] count;
    class Pair{
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        Pair[] arr = new Pair[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        count = new int[n];

        Pair[] temp = new Pair[n];

        mergeSort(arr, temp, 0, n-1);

        List<Integer> result = new ArrayList<>();
        for(int x:count) {
            result.add(x);
        }
        
        return result;
    }
    private void mergeSort(Pair[] arr, Pair[] temp, int left, int right) {
        if(left>=right) {
            return;
        }
        int mid = left+(right-left)/2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid+1, right);

        merge(arr, temp, left, mid, right);
    }
    private void merge(Pair[] arr, Pair[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        int k = left;
        int rightCount = 0;

        while(i<=mid && j<=right) {
            if(arr[j].value < arr[i].value) {
                temp[k] = arr[j];
                k++;
                j++;
                rightCount++;
            } else{
                count[arr[i].index] += rightCount;
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
        while(i<=mid) {
            count[arr[i].index] += rightCount;
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(int x=left; x<=right; x++) {
            arr[x] = temp[x];
        }
    }
}
