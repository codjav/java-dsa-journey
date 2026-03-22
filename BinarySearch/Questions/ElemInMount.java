package BinarySearch.Questions;

public class ElemInMount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,5,4,3,2,1,0};
        // System.out.println(find(arr, 4));
        System.out.println(find(arr,0));
    }

    static int find(int[] arr, int a) {
        int p = peak(arr);
        int left = left(arr, p, a);
        if (left != -1) {
            return left;
        }else {
            int right = right(arr, p, a);
            if (right != -1) {
                return right;
            }else {
                return -1;
            }
        }
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if (mid<arr.length-1 && arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end;
    }

    static int left(int[] arr, int p, int num) {
        int start = 0;
        int end = p;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == num) {
                return mid;
            }else if (arr[mid] > num) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int right(int[] arr, int p, int num) {
        int start = p+1;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == num) {
                return mid;
            }else if (arr[mid] > num) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
