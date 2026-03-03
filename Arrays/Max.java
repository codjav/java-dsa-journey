package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int max = 0;
        for (int i : arr) {
            if (arr == null) {
                System.out.println("No items in the array given.");
            }
            if (i>max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
