package BinarySearch.Questions;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(search(arr, k));
    }

    static int search(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        // if all are after the array range -
        if(arr[end]-(end+1)>=k) {
            return end+1+k;
        } 

        while(start<=end) {
            int mid = start + (end-start)/2;
            
            if(arr[mid]-(mid+1)>=k) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return start+k;
    }
}
