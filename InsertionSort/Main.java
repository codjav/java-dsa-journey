package InsertionSort;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,6,2,4,3,5,7,4,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertion(int[] arr) {
        for(int i=0; i<=arr.length-2; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
