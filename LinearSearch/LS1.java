package LinearSearch;

public class LS1 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 64, 26, 93, 58, -2, 94, -67};
        int target = -2;

        int ans = LS(nums, target);
        System.out.println(ans);
    }
    
    static int LS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
