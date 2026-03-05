package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int min = 0;
        for (int i : arr) {
            if (min>i) {
                min = i;
            }
        }
        return min;
    }
}
