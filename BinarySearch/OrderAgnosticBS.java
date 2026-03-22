package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90,83,75,64,58,47,33,25,11};
        int[] arr1 = {11,25,33,47,58,64,75,83,90};

        System.out.println(orderAgno(arr, 11));
        System.out.println(orderAgno(arr1, 11));
    }
    
    static int orderAgno(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }else {
                if (arr[start] > arr[end]) {
                    if (target > arr[mid]) {
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }else {
                    if (target > arr[mid]) {
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }
            }
        }
        return -1;
    }
}
