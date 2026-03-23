package BinarySearch.Questions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {-1,-1,1,2,3};
        int target = -1;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int sum = numbers[start]+ numbers[end];
            if(sum == target) {
                return new int[]{start+1, end+1};
            }else if(sum < target) {
                start++;
            }else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
