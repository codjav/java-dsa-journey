package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        int ans = search(arr, 1, 4, 28);
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end, int target) {
        if (end<start) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
